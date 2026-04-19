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

public class ResetPasswordActivity extends AppCompatActivity {

    EditText etEmail;
    Button btnResetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reset_password);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        String email=etEmail.getText().toString();
        btnResetPassword.setOnClickListener(view->{
            startActivity(new Intent(ResetPasswordActivity.this,UpdatePasswordActivity.class));
            finish();
        });
    }
    private void init()
    {
        etEmail=findViewById(R.id.etEmail);
        btnResetPassword=findViewById(R.id.btnResetPassword);
    }
}