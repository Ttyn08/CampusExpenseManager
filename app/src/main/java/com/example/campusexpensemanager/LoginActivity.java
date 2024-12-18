package com.example.campusexpensemanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.campusexpensemanager.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.loginEmail.getText().toString();
                String password = binding.loginPassword.getText().toString();

                if (email.equals("") || password.equals("")) {
                    Toast.makeText(LoginActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                } else {
                    boolean checkCredentials = databaseHelper.checkEmailPassword(email, password);

                    if (checkCredentials) {
                        User user = databaseHelper.getUserDetails(email);
                        if (user != null) {
                            Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, MenuActivity.class);

                            // Lưu thông tin người dùng vào SharedPreferences
                            SharedPreferences sharedPreferences = getSharedPreferences("userPrefs", MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString("EMAIL_KEY", user.getEmail());
                            editor.putString("HNAME_KEY", user.getName());
                            editor.putString("NAME_KEY", user.getName());
                            editor.putInt("AGE_KEY", user.getAge());
                            editor.putString("PHONE_KEY", user.getPhone());
                            editor.apply();

                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginActivity.this, "User details not found", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        binding.signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

//        binding.loginPassword.setOnTouchListener((v, event) -> {
//            final int DRAWABLE_RIGHT = 2; // Vị trí của `drawableEnd`
//            if (event.getAction() == MotionEvent.ACTION_UP) {
//                if (event.getRawX() >= (binding.loginPassword.getRight() - binding.loginPassword.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
//                    togglePasswordVisibility(binding.loginPassword);
//                    return true;
//                }
//            }
//            return false;
//        });
    }
//    private void togglePasswordVisibility(EditText editText) {
//        int selection = editText.getSelectionStart(); // Lưu vị trí con trỏ hiện tại
//
//        if (editText.getInputType() == (InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD)) {
//            // Hiển thị mật khẩu
//            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
//            editText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_password_login, 0, R.drawable.ic_eye_open, 0);
//        } else {
//            // Ẩn mật khẩu
//            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
//            editText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_password_login, 0, R.drawable.ic_eye_closed, 0);
//        }
//
//        editText.setSelection(selection); // Đặt lại vị trí con trỏ về cuối
//    }

}
