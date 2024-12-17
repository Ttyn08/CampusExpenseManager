// Generated by view binder compiler. Do not edit!
package com.example.campusexpensemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.campusexpensemanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout rl;

  @NonNull
  public final RecyclerView rvExpense;

  @NonNull
  public final RecyclerView rvIncome;

  @NonNull
  public final TextView tvExp;

  @NonNull
  public final TextView tvExpense;

  @NonNull
  public final TextView tvInc;

  @NonNull
  public final TextView tvIncome;

  @NonNull
  public final TextView tvText2;

  private FragmentHomeBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout rl,
      @NonNull RecyclerView rvExpense, @NonNull RecyclerView rvIncome, @NonNull TextView tvExp,
      @NonNull TextView tvExpense, @NonNull TextView tvInc, @NonNull TextView tvIncome,
      @NonNull TextView tvText2) {
    this.rootView = rootView;
    this.rl = rl;
    this.rvExpense = rvExpense;
    this.rvIncome = rvIncome;
    this.tvExp = tvExp;
    this.tvExpense = tvExpense;
    this.tvInc = tvInc;
    this.tvIncome = tvIncome;
    this.tvText2 = tvText2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rl;
      LinearLayout rl = ViewBindings.findChildViewById(rootView, id);
      if (rl == null) {
        break missingId;
      }

      id = R.id.rv_expense;
      RecyclerView rvExpense = ViewBindings.findChildViewById(rootView, id);
      if (rvExpense == null) {
        break missingId;
      }

      id = R.id.rv_income;
      RecyclerView rvIncome = ViewBindings.findChildViewById(rootView, id);
      if (rvIncome == null) {
        break missingId;
      }

      id = R.id.tvExp;
      TextView tvExp = ViewBindings.findChildViewById(rootView, id);
      if (tvExp == null) {
        break missingId;
      }

      id = R.id.tv_expense;
      TextView tvExpense = ViewBindings.findChildViewById(rootView, id);
      if (tvExpense == null) {
        break missingId;
      }

      id = R.id.tvInc;
      TextView tvInc = ViewBindings.findChildViewById(rootView, id);
      if (tvInc == null) {
        break missingId;
      }

      id = R.id.tv_income;
      TextView tvIncome = ViewBindings.findChildViewById(rootView, id);
      if (tvIncome == null) {
        break missingId;
      }

      id = R.id.tv_text2;
      TextView tvText2 = ViewBindings.findChildViewById(rootView, id);
      if (tvText2 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((RelativeLayout) rootView, rl, rvExpense, rvIncome, tvExp,
          tvExpense, tvInc, tvIncome, tvText2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}