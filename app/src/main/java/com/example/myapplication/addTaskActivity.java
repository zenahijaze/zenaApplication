package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class addTaskActivity extends AppCompatActivity {
    private TextInputEditText etTitle,etSubject;
    private TextView etImportant;
    private Spinner spinner;
    private SeekBar sbimportant;
    private ImageView imageView2;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        etTitle=findViewById(R.id.etTitle);
        etSubject=findViewById(R.id.etSubject);
        etImportant=findViewById(R.id.etImportant);
        spinner=findViewById(R.id.spinner);
        sbimportant=findViewById(R.id.sbimportant);
        imageView2=findViewById(R.id.imageView2);
        btnsave=findViewById(R.id.btnsave);
    }
}