// Generated by view binder compiler. Do not edit!
package com.example.campusexpensemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.campusexpensemanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final LinearLayout linearll;

  @NonNull
  public final TextView logoutTextView;

  private ToolbarBinding(@NonNull RelativeLayout rootView, @NonNull ImageView backButton,
      @NonNull LinearLayout linearll, @NonNull TextView logoutTextView) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.linearll = linearll;
    this.logoutTextView = logoutTextView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.linearll;
      LinearLayout linearll = ViewBindings.findChildViewById(rootView, id);
      if (linearll == null) {
        break missingId;
      }

      id = R.id.logoutTextView;
      TextView logoutTextView = ViewBindings.findChildViewById(rootView, id);
      if (logoutTextView == null) {
        break missingId;
      }

      return new ToolbarBinding((RelativeLayout) rootView, backButton, linearll, logoutTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}