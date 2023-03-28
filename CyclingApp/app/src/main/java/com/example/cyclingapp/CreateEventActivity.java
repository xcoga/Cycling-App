package com.example.cyclingapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.widget.TimePicker;
import java.util.Calendar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.TimeZone;


public class CreateEventActivity extends AppCompatActivity implements OnDataPass {

    private EventRepository eventRepository;
    private EditText eventNameInput;
    private EditText eventLocationInput;
    private EditText eventStartTimeInput;
    private Button createEventButton;
    private Button backButton;

    private Button eventDateButton;
    private Button eventTimeButton;
    private Calendar eventDateTime;
    private Button setRouteButton;
    private List<LatLng> latLngList_here;

    private Calendar selectedDate;
    private Calendar selectedTime;

    //these 2 variables are to check if user has set date and time
    //TODO to add code to check if user sets date and time properly.
    //TODO Right now, user can click but not set date and time and create an event
    //TODO add code to make sure user confirms route before creating event.
    private int date_check = 0;
    private int time_check = 0;


    // private EditText eventDateInput;
    //private EditText eventTimeInput;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        // Initialize the event repository and UI components
        eventRepository = new EventRepository();
        eventNameInput = findViewById(R.id.event_name_input);
        eventLocationInput = findViewById(R.id.event_location_input);
       // eventStartTimeInput = findViewById(R.id.event_start_time_input);
        createEventButton = findViewById(R.id.create_event_button);

        eventDateButton = findViewById(R.id.event_date_button);
        eventTimeButton = findViewById(R.id.event_time_button);
        backButton = findViewById(R.id.go_back);
        eventDateTime = Calendar.getInstance();

        selectedDate = Calendar.getInstance();
        selectedTime = Calendar.getInstance();


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_create_event
                ,new setRouteFragment()).commit();



        //Set a click listener for time and date
        eventDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        eventTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialog();
            }
        });


        // Set a click listener for the create event button
        createEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createEvent();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHomeActivity();
            }
        });
    }
    //for date and time
    private void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        eventDateTime.set(Calendar.YEAR, year);
                        eventDateTime.set(Calendar.MONTH, month);
                        eventDateTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                        eventDateButton.setText(String.format("%04d-%02d-%02d", year, month + 1, dayOfMonth));
                    }
                },
                eventDateTime.get(Calendar.YEAR),
                eventDateTime.get(Calendar.MONTH),
                eventDateTime.get(Calendar.DAY_OF_MONTH)
        );

        datePickerDialog.show();
        if(datePickerDialog!= null) date_check = 1;
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        eventDateTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
                        eventDateTime.set(Calendar.MINUTE, minute);
                        eventTimeButton.setText(String.format("%02d:%02d", hourOfDay, minute));
                    }
                },
                eventDateTime.get(Calendar.HOUR_OF_DAY),
                eventDateTime.get(Calendar.MINUTE),
                true
        );
        timePickerDialog.show();
        if(timePickerDialog!= null) time_check = 1;
    }


    private void createEvent() {
        if (date_check==0 || time_check==0) return;


        // Get user input for event name, location, and start time
        String eventName = eventNameInput.getText().toString();
        String eventLocation = eventLocationInput.getText().toString();
       // String eventStartTimeString = eventStartTimeInput.getText().toString();
        //Date eventStartTime;
        TimeZone singaporeTimeZone = TimeZone.getTimeZone("Asia/Singapore");
        eventDateTime.setTimeZone(singaporeTimeZone);
        Date eventStartTime = eventDateTime.getTime();

        // Convert the start time string to a Date object
       /* try {
            eventStartTime = new Date(Long.parseLong(eventStartTimeString));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid start time format", Toast.LENGTH_SHORT).show();
            return;
        }*/

        // Get the actual user ID from Firebase Authentication
        String creatorId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        List<String> participants = new ArrayList<>();

        // Create a new event object with the user input and user ID
        Events event = new Events(null, eventName, eventStartTime, eventLocation, creatorId, participants);
        event.setEventLatLngLst(latLngList_here);


        // Add the event to the repository
        eventRepository.addEvent(event)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        // Show a success message and close the activity
                        Toast.makeText(CreateEventActivity.this, "Event created successfully", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Show an error message if the event creation failed
                        Toast.makeText(CreateEventActivity.this, "Failed to create event", Toast.LENGTH_SHORT).show();
                    }
                });
    }
    private void openHomeActivity() {
        Intent intent = new Intent(CreateEventActivity.this, HomeActivity.class);
        startActivity(intent);
    }


    @Override
    public void onDataPass(List<com.google.android.gms.maps.model.LatLng> latLngList) {
        latLngList_here = latLngList;
        for (int i=0;i<latLngList.size();i++){
            Log.d("receive LatLngList",latLngList_here.get(i).toString());
        }

    }
}
