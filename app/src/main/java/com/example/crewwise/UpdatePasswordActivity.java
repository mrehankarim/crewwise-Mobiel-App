package com.example.crewwise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UpdatePasswordActivity extends AppCompatActivity {

    EditText etPassword,etConfirmPassword;
    Button btnUpdatePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forget_password);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        String password=etPassword.getText().toString();
        String confirmPassword=etConfirmPassword.getText().toString();
        btnUpdatePassword.setOnClickListener(view->{
            startActivity(new Intent(UpdatePasswordActivity.this,MainActivity.class));
            finish();
        });
    }
    private  void  init()
    {
        etPassword=findViewById(R.id.etPassword);
        etConfirmPassword=findViewById(R.id.etConfirmPassword);
        btnUpdatePassword=findViewById(R.id.btnUpdatePassword);
    }
}