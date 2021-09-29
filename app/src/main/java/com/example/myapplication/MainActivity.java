package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private SearchView svSearchTask;
    private ListView lstvAllTasks;
    private FloatingActionButton Fabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        svSearchTask  =findViewById(R.id.svSearchTask);
        lstvAllTasks=findViewById(R.id.lstvAllTasks);
        Fabtn=findViewById(R.id.Fabtn);
    }
}