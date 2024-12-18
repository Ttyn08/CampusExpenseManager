package com.example.campusexpensemanager;

import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.campusexpensemanager.databinding.ActivityChangePasswordBinding;

public class ChangePasswordActivity extends AppCompatActivity {

    private EditText oldPasswordEditText;
    private EditText newPasswordEditText;
    private EditText confirmNewPasswordEditText;
    private Button changePasswordButton;
    private DatabaseHelper databaseHelper;
    private String email;

    ActivityChangePasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        binding = ActivityChangePasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Khởi tạo các view
        oldPasswordEditText = findViewById(R.id.oldPasswordEditText);
        newPasswordEditText = findViewById(R.id.newPasswordEditText);
        confirmNewPasswordEditText = findViewById(R.id.confirmNewPasswordEditText);
        changePasswordButton = findViewById(R.id.changePasswordButton);

        // Nhận email từ Intent
        email = getIntent().getStringExtra("EMAIL_KEY");
        if (email == null) {
            Toast.makeText(this, "Email not found", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        databaseHelper = new DatabaseHelper(this);

        changePasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldPassword = oldPasswordEditText.getText().toString();
                String newPassword = newPasswordEditText.getText().toString();
                String confirmNewPassword = confirmNewPasswordEditText.getText().toString();

                if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
                    Toast.makeText(ChangePasswordActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                } else if (!newPassword.equals(confirmNewPassword)) {
                    Toast.makeText(ChangePasswordActivity.this, "New passwords do not match", Toast.LENGTH_SHORT).show();
                } else if (!databaseHelper.checkEmailPassword(email, oldPassword)) {
                    Toast.makeText(ChangePasswordActivity.this, "Old password is incorrect", Toast.LENGTH_SHORT).show();
                } else {
                    boolean update = databaseHelper.updatePassword(email, newPassword);
                    if (update) {
                        Toast.makeText(ChangePasswordActivity.this, "Password changed successfully", Toast.LENGTH_SHORT).show();
                        finish(); // Kết thúc Activity và quay lại MainActivity
                    } else {
                        Toast.makeText(ChangePasswordActivity.this, "Password change failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        binding.oldPasswordEditText.setOnTouchListener((v, event) -> {
            final int DRAWABLE_RIGHT = 2; // Vị trí của `drawableEnd`
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= (binding.oldPasswordEditText.getRight() - binding.oldPasswordEditText.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                    togglePasswordVisibility(binding.oldPasswordEditText);
                    return true;
                }
            }
            return false;
        });
        binding.newPasswordEditText.setOnTouchListener((v, event) -> {
            final int DRAWABLE_RIGHT = 2; // Vị trí của `drawableEnd`
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= (binding.newPasswordEditText.getRight() - binding.newPasswordEditText.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                    togglePasswordVisibility(binding.newPasswordEditText);
                    return true;
                }
            }
            return false;
        });
        binding.confirmNewPasswordEditText.setOnTouchListener((v, event) -> {
            final int DRAWABLE_RIGHT = 2; // Vị trí của `drawableEnd`
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= (binding.confirmNewPasswordEditText.getRight() - binding.confirmNewPasswordEditText.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                    togglePasswordVisibility(binding.confirmNewPasswordEditText);
                    return true;
                }
            }
            return false;
        });
    }
    private void togglePasswordVisibility(EditText editText) {
        if (editText.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
            // Hiển thị mật khẩu
            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_eye_open, 0); // Đổi icon mắt mở
        } else {
            // Ẩn mật khẩu
            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_eye_closed, 0); // Đổi icon mắt đóng
        }
        // Di chuyển con trỏ về cuối văn bản
        editText.setSelection(editText.getText().length());
    }
}

