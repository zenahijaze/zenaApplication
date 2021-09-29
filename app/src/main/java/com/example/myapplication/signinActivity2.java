package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signinActivity2 extends AppCompatActivity {
    private TextInputEditText etEmail,etPassword;
    private Button btnLogin,btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin2);

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
       btnregister=findViewById(R.id.btnregister);
        btnLogin=findViewById(R.id.btnLogin);
    }
}