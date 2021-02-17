package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Demo2 extends AppCompatActivity {
    TextView tv;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
         tv=findViewById(R.id.demo2_tv);
         string =getIntent().getStringExtra("data");
         tv.setText(string);
    }
}