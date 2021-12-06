package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {
    private SearchView svSearchTask;
    private ListView lstvAllTasks;
    private FloatingActionButton Fabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        svSearchTask = findViewById(R.id.svSearchTask);
        lstvAllTasks = findViewById(R.id.lstvAllTasks);
        Fabtn = findViewById(R.id.Fabtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.Setting) {
            Intent i = new Intent(getApplicationContext(), SettingActivity2.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.SignOut) {
            Intent i = new Intent(getApplicationContext(), signupActivity2.class);
            startActivity(i);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure?");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes", this);
            builder.setNegativeButton("No", this);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        if (item.getItemId() == R.id.History) {
            Intent i = new Intent(getApplicationContext(), historyActivity.class);
            startActivity(i);

        }
        return true;


    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        if (which == dialogInterface.BUTTON_POSITIVE) {
            Toast.makeText(getApplicationContext(), "Loging out", Toast.LENGTH_SHORT).show();
            dialogInterface.cancel();
            finish();// To close current activity
        }
        if (which == dialogInterface.BUTTON_NEGATIVE) {
            Toast.makeText(getApplicationContext(), "Loging out cancle", Toast.LENGTH_SHORT).show();
            dialogInterface.cancel();

        }
    }
}