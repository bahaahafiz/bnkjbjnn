package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activityb extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityb);
        tv=findViewById(R.id.tv_name);
        Intent i =getIntent();
         String name=i.getStringExtra("username");
         tv.setText(name);

    }
}