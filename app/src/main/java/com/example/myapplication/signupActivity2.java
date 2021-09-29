package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signupActivity2 extends AppCompatActivity {
    private TextInputEditText etEmail,etPassword,etRepassword,etPhone,etFullName;
    private Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        etRepassword=findViewById(R.id.etRepassword);
        etPhone=findViewById(R.id.etPhone);
        etFullName=findViewById(R.id.etFullName);
        btnsave=findViewById(R.id.btnsave);
    }
}