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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.campusexpensemanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentExpenseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivExpensePie;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final TextView recyclerviewTitle;

  @NonNull
  public final RelativeLayout rr;

  @NonNull
  public final RecyclerView rvExpense;

  @NonNull
  public final TextView tvExpense;

  private FragmentExpenseBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView ivExpensePie, @NonNull LinearLayout ll,
      @NonNull TextView recyclerviewTitle, @NonNull RelativeLayout rr,
      @NonNull RecyclerView rvExpense, @NonNull TextView tvExpense) {
    this.rootView = rootView;
    this.ivExpensePie = ivExpensePie;
    this.ll = ll;
    this.recyclerviewTitle = recyclerviewTitle;
    this.rr = rr;
    this.rvExpense = rvExpense;
    this.tvExpense = tvExpense;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentExpenseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentExpenseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_expense, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentExpenseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_expensePie;
      ImageView ivExpensePie = ViewBindings.findChildViewById(rootView, id);
      if (ivExpensePie == null) {
        break missingId;
      }

      id = R.id.ll;
      LinearLayout ll = ViewBindings.findChildViewById(rootView, id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.recyclerview_title;
      TextView recyclerviewTitle = ViewBindings.findChildViewById(rootView, id);
      if (recyclerviewTitle == null) {
        break missingId;
      }

      id = R.id.rr;
      RelativeLayout rr = ViewBindings.findChildViewById(rootView, id);
      if (rr == null) {
        break missingId;
      }

      id = R.id.rvExpense;
      RecyclerView rvExpense = ViewBindings.findChildViewById(rootView, id);
      if (rvExpense == null) {
        break missingId;
      }

      id = R.id.tvExpense;
      TextView tvExpense = ViewBindings.findChildViewById(rootView, id);
      if (tvExpense == null) {
        break missingId;
      }

      return new FragmentExpenseBinding((ConstraintLayout) rootView, ivExpensePie, ll,
          recyclerviewTitle, rr, rvExpense, tvExpense);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
