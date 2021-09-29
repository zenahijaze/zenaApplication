package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SettingActivity2 extends AppCompatActivity {
    private TextView tvSignIn;
    private ToggleButton TbtnSignin;
    private Button btnsignout,btnClearhistory;
    private RadioButton rbtnDelete,rbtnCross,rbtnMove;
    private RadioGroup rGroup;
    private Switch swKeepHistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);
        tvSignIn=findViewById(R.id.tvSignIn);
        TbtnSignin=findViewById(R.id.TbtnSignin);
        btnsignout=findViewById(R.id.btnsignout);
        btnClearhistory=findViewById(R.id.btnClearhistory);
        rbtnDelete=findViewById(R.id.rbtnDelete);
        rbtnCross=findViewById(R.id.rbtnCross);
        rbtnMove=findViewById(R.id.rbtnMove);
        rGroup=findViewById(R.id.rGroup);
        swKeepHistory=findViewById(R.id.swKeepHistory);

    }
}