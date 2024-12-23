// Generated by view binder compiler. Do not edit!
package com.example.campusexpensemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.campusexpensemanager.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddBudgetsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final EditText etIncomeAmount;

  @NonNull
  public final EditText etIncomeNote;

  @NonNull
  public final EditText etIncomeType;

  private AddBudgetsBinding(@NonNull LinearLayout rootView, @NonNull Button btnCancel,
      @NonNull Button btnSave, @NonNull EditText etIncomeAmount, @NonNull EditText etIncomeNote,
      @NonNull EditText etIncomeType) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnSave = btnSave;
    this.etIncomeAmount = etIncomeAmount;
    this.etIncomeNote = etIncomeNote;
    this.etIncomeType = etIncomeType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddBudgetsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddBudgetsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_budgets, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddBudgetsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.et_incomeAmount;
      EditText etIncomeAmount = ViewBindings.findChildViewById(rootView, id);
      if (etIncomeAmount == null) {
        break missingId;
      }

      id = R.id.et_incomeNote;
      EditText etIncomeNote = ViewBindings.findChildViewById(rootView, id);
      if (etIncomeNote == null) {
        break missingId;
      }

      id = R.id.et_incomeType;
      EditText etIncomeType = ViewBindings.findChildViewById(rootView, id);
      if (etIncomeType == null) {
        break missingId;
      }

      return new AddBudgetsBinding((LinearLayout) rootView, btnCancel, btnSave, etIncomeAmount,
          etIncomeNote, etIncomeType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
