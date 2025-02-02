// Generated by view binder compiler. Do not edit!
package com.example.cyclingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemChatRoomBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView participantsID;

  @NonNull
  public final TextView participantsUsername;

  private ItemChatRoomBinding(@NonNull LinearLayout rootView, @NonNull TextView participantsID,
      @NonNull TextView participantsUsername) {
    this.rootView = rootView;
    this.participantsID = participantsID;
    this.participantsUsername = participantsUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChatRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChatRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_chat_room, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChatRoomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.participants_ID;
      TextView participantsID = ViewBindings.findChildViewById(rootView, id);
      if (participantsID == null) {
        break missingId;
      }

      id = R.id.participants_Username;
      TextView participantsUsername = ViewBindings.findChildViewById(rootView, id);
      if (participantsUsername == null) {
        break missingId;
      }

      return new ItemChatRoomBinding((LinearLayout) rootView, participantsID, participantsUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
