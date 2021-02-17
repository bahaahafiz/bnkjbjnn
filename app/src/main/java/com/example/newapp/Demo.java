package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Demo extends AppCompatActivity {
    Spinner sp;
    Button bt;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        sp=findViewById(R.id.demo_sp);
        bt=findViewById(R.id.demo_btn);
        s=sp.getSelectedItem().toString();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent =new Intent(Demo.this,Demo2.class);
//                intent.putExtra("data",s);
//                startActivity(intent);
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,s);
                startActivity(intent);


            }
        });
    }
}