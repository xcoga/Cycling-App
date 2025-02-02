// Generated by view binder compiler. Do not edit!
package com.example.cyclingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cyclingapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EventDetails2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final TextView date2;

  @NonNull
  public final TextView dateInfo2;

  @NonNull
  public final TextView eventName2;

  @NonNull
  public final FrameLayout fragmentContainerViewRoute2;

  @NonNull
  public final TextView locInfo2;

  @NonNull
  public final TextView locationInfo2;

  @NonNull
  public final TextView partInfo2;

  @NonNull
  public final TextView partInfo3;

  @NonNull
  public final TextView participants2;

  @NonNull
  public final TextView participantsUsername;

  @NonNull
  public final Button startButton;

  private EventDetails2Binding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull TextView date2, @NonNull TextView dateInfo2, @NonNull TextView eventName2,
      @NonNull FrameLayout fragmentContainerViewRoute2, @NonNull TextView locInfo2,
      @NonNull TextView locationInfo2, @NonNull TextView partInfo2, @NonNull TextView partInfo3,
      @NonNull TextView participants2, @NonNull TextView participantsUsername,
      @NonNull Button startButton) {
    this.rootView = rootView;
    this.back = back;
    this.date2 = date2;
    this.dateInfo2 = dateInfo2;
    this.eventName2 = eventName2;
    this.fragmentContainerViewRoute2 = fragmentContainerViewRoute2;
    this.locInfo2 = locInfo2;
    this.locationInfo2 = locationInfo2;
    this.partInfo2 = partInfo2;
    this.partInfo3 = partInfo3;
    this.participants2 = participants2;
    this.participantsUsername = participantsUsername;
    this.startButton = startButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EventDetails2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EventDetails2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.event_details2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EventDetails2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      Button back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.date2;
      TextView date2 = ViewBindings.findChildViewById(rootView, id);
      if (date2 == null) {
        break missingId;
      }

      id = R.id.dateInfo2;
      TextView dateInfo2 = ViewBindings.findChildViewById(rootView, id);
      if (dateInfo2 == null) {
        break missingId;
      }

      id = R.id.eventName2;
      TextView eventName2 = ViewBindings.findChildViewById(rootView, id);
      if (eventName2 == null) {
        break missingId;
      }

      id = R.id.fragment_container_view_route2;
      FrameLayout fragmentContainerViewRoute2 = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainerViewRoute2 == null) {
        break missingId;
      }

      id = R.id.locInfo2;
      TextView locInfo2 = ViewBindings.findChildViewById(rootView, id);
      if (locInfo2 == null) {
        break missingId;
      }

      id = R.id.locationInfo2;
      TextView locationInfo2 = ViewBindings.findChildViewById(rootView, id);
      if (locationInfo2 == null) {
        break missingId;
      }

      id = R.id.partInfo2;
      TextView partInfo2 = ViewBindings.findChildViewById(rootView, id);
      if (partInfo2 == null) {
        break missingId;
      }

      id = R.id.partInfo3;
      TextView partInfo3 = ViewBindings.findChildViewById(rootView, id);
      if (partInfo3 == null) {
        break missingId;
      }

      id = R.id.participants2;
      TextView participants2 = ViewBindings.findChildViewById(rootView, id);
      if (participants2 == null) {
        break missingId;
      }

      id = R.id.participants_Username;
      TextView participantsUsername = ViewBindings.findChildViewById(rootView, id);
      if (participantsUsername == null) {
        break missingId;
      }

      id = R.id.startButton;
      Button startButton = ViewBindings.findChildViewById(rootView, id);
      if (startButton == null) {
        break missingId;
      }

      return new EventDetails2Binding((LinearLayout) rootView, back, date2, dateInfo2, eventName2,
          fragmentContainerViewRoute2, locInfo2, locationInfo2, partInfo2, partInfo3, participants2,
          participantsUsername, startButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
