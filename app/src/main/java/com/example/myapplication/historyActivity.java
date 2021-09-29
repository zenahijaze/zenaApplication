package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class historyActivity extends AppCompatActivity {
    private SearchView SerView;
    private ListView lisView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        SerView=findViewById(R.id. SerView);
        lisView=findViewById(R.id.lisView);
    }
}