// Generated by view binder compiler. Do not edit!
package com.example.campusexpensemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.campusexpensemanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutIncomeItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cvUrl;

  @NonNull
  public final TextView tvIncomeAmount;

  @NonNull
  public final TextView tvIncomeDate;

  @NonNull
  public final TextView tvIncomeJob;

  private LayoutIncomeItemBinding(@NonNull RelativeLayout rootView, @NonNull CardView cvUrl,
      @NonNull TextView tvIncomeAmount, @NonNull TextView tvIncomeDate,
      @NonNull TextView tvIncomeJob) {
    this.rootView = rootView;
    this.cvUrl = cvUrl;
    this.tvIncomeAmount = tvIncomeAmount;
    this.tvIncomeDate = tvIncomeDate;
    this.tvIncomeJob = tvIncomeJob;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutIncomeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutIncomeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_income_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutIncomeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cv_url;
      CardView cvUrl = ViewBindings.findChildViewById(rootView, id);
      if (cvUrl == null) {
        break missingId;
      }

      id = R.id.tv_incomeAmount;
      TextView tvIncomeAmount = ViewBindings.findChildViewById(rootView, id);
      if (tvIncomeAmount == null) {
        break missingId;
      }

      id = R.id.tv_incomeDate;
      TextView tvIncomeDate = ViewBindings.findChildViewById(rootView, id);
      if (tvIncomeDate == null) {
        break missingId;
      }

      id = R.id.tv_incomeJob;
      TextView tvIncomeJob = ViewBindings.findChildViewById(rootView, id);
      if (tvIncomeJob == null) {
        break missingId;
      }

      return new LayoutIncomeItemBinding((RelativeLayout) rootView, cvUrl, tvIncomeAmount,
          tvIncomeDate, tvIncomeJob);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}