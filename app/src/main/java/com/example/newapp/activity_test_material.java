 package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

 public class activity_test_material extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_material);
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}