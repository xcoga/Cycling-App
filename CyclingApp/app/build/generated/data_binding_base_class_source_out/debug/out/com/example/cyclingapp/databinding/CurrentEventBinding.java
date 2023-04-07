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

public final class CurrentEventBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView calories;

  @NonNull
  public final TextView caloriesTextView;

  @NonNull
  public final TextView currentEventName;

  @NonNull
  public final TextView distance;

  @NonNull
  public final TextView distanceRemaining;

  @NonNull
  public final TextView distanceTextView;

  @NonNull
  public final Button joinEvent;

  @NonNull
  public final TextView remainingDistanceTextView;

  @NonNull
  public final TextView time;

  @NonNull
  public final TextView timeElapsedTextView;

  @NonNull
  public final FrameLayout viewRouteContainer;

  private CurrentEventBinding(@NonNull LinearLayout rootView, @NonNull TextView calories,
      @NonNull TextView caloriesTextView, @NonNull TextView currentEventName,
      @NonNull TextView distance, @NonNull TextView distanceRemaining,
      @NonNull TextView distanceTextView, @NonNull Button joinEvent,
      @NonNull TextView remainingDistanceTextView, @NonNull TextView time,
      @NonNull TextView timeElapsedTextView, @NonNull FrameLayout viewRouteContainer) {
    this.rootView = rootView;
    this.calories = calories;
    this.caloriesTextView = caloriesTextView;
    this.currentEventName = currentEventName;
    this.distance = distance;
    this.distanceRemaining = distanceRemaining;
    this.distanceTextView = distanceTextView;
    this.joinEvent = joinEvent;
    this.remainingDistanceTextView = remainingDistanceTextView;
    this.time = time;
    this.timeElapsedTextView = timeElapsedTextView;
    this.viewRouteContainer = viewRouteContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CurrentEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CurrentEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.current_event, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CurrentEventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calories;
      TextView calories = ViewBindings.findChildViewById(rootView, id);
      if (calories == null) {
        break missingId;
      }

      id = R.id.caloriesTextView;
      TextView caloriesTextView = ViewBindings.findChildViewById(rootView, id);
      if (caloriesTextView == null) {
        break missingId;
      }

      id = R.id.currentEventName;
      TextView currentEventName = ViewBindings.findChildViewById(rootView, id);
      if (currentEventName == null) {
        break missingId;
      }

      id = R.id.distance;
      TextView distance = ViewBindings.findChildViewById(rootView, id);
      if (distance == null) {
        break missingId;
      }

      id = R.id.distanceRemaining;
      TextView distanceRemaining = ViewBindings.findChildViewById(rootView, id);
      if (distanceRemaining == null) {
        break missingId;
      }

      id = R.id.distanceTextView;
      TextView distanceTextView = ViewBindings.findChildViewById(rootView, id);
      if (distanceTextView == null) {
        break missingId;
      }

      id = R.id.joinEvent;
      Button joinEvent = ViewBindings.findChildViewById(rootView, id);
      if (joinEvent == null) {
        break missingId;
      }

      id = R.id.remainingDistanceTextView;
      TextView remainingDistanceTextView = ViewBindings.findChildViewById(rootView, id);
      if (remainingDistanceTextView == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      id = R.id.timeElapsedTextView;
      TextView timeElapsedTextView = ViewBindings.findChildViewById(rootView, id);
      if (timeElapsedTextView == null) {
        break missingId;
      }

      id = R.id.viewRouteContainer;
      FrameLayout viewRouteContainer = ViewBindings.findChildViewById(rootView, id);
      if (viewRouteContainer == null) {
        break missingId;
      }

      return new CurrentEventBinding((LinearLayout) rootView, calories, caloriesTextView,
          currentEventName, distance, distanceRemaining, distanceTextView, joinEvent,
          remainingDistanceTextView, time, timeElapsedTextView, viewRouteContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
