package com.example.crewwise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    EditText etEmail,etPassword;
    TextView tvForgetPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();

        String email=etEmail.getText().toString();
        String password=etPassword.getText().toString();
        tvForgetPassword.setOnClickListener(view->{
            startActivity(new Intent(Login.this, ResetPasswordActivity.class));
        });
        btnLogin.setOnClickListener(view->{
            startActivity(new Intent(Login.this,MainActivity.class));
            finish();
        });
    }
    public void init()
    {
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        tvForgetPassword=findViewById(R.id.tvForgotPassword);
        btnLogin=findViewById(R.id.btnLogin);
    }
}