package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * شاشةعرض اولة تعرض
 */
public class SplashScreenActivity2 extends AppCompatActivity {
    private ImageView imview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);
        //Thread.1
        Thread th=new Thread(){
            //Thread.2
            @Override
            public void run() {
                //هنا المقطع الذي سيعمل بالتزامن مع مقاطع اخرى
                //thread.3
           int ms=3*1000;//milliseconnds
                try {
                    sleep(ms);
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       imview=findViewById(R.id.imview);
    }
}