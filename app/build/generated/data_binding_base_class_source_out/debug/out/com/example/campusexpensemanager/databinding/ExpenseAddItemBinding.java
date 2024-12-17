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

public final class ExpenseAddItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final EditText edtExpensesAmount;

  @NonNull
  public final EditText edtExpensesNote;

  @NonNull
  public final EditText edtExpensesType;

  private ExpenseAddItemBinding(@NonNull LinearLayout rootView, @NonNull Button btnCancel,
      @NonNull Button btnSave, @NonNull EditText edtExpensesAmount,
      @NonNull EditText edtExpensesNote, @NonNull EditText edtExpensesType) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnSave = btnSave;
    this.edtExpensesAmount = edtExpensesAmount;
    this.edtExpensesNote = edtExpensesNote;
    this.edtExpensesType = edtExpensesType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExpenseAddItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExpenseAddItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.expense_add_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExpenseAddItemBinding bind(@NonNull View rootView) {
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

      id = R.id.edt_ExpensesAmount;
      EditText edtExpensesAmount = ViewBindings.findChildViewById(rootView, id);
      if (edtExpensesAmount == null) {
        break missingId;
      }

      id = R.id.edt_ExpensesNote;
      EditText edtExpensesNote = ViewBindings.findChildViewById(rootView, id);
      if (edtExpensesNote == null) {
        break missingId;
      }

      id = R.id.edt_ExpensesType;
      EditText edtExpensesType = ViewBindings.findChildViewById(rootView, id);
      if (edtExpensesType == null) {
        break missingId;
      }

      return new ExpenseAddItemBinding((LinearLayout) rootView, btnCancel, btnSave,
          edtExpensesAmount, edtExpensesNote, edtExpensesType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
