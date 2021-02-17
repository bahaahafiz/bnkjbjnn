package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static android.os.Environment.MEDIA_MOUNTED_READ_ONLY;

public class MainActivity2 extends AppCompatActivity {
    Button save, store;
    EditText et_model, et_color, et_distance;
    MydataBase dp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        save = findViewById(R.id.btn_save);
        store = findViewById(R.id.btn_store);
        et_model = findViewById(R.id.et_model);
        et_color = findViewById(R.id.et_color);
        et_distance = findViewById(R.id.et_distane);
        dp=new MydataBase(this);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String model=et_model.getText().toString();
                String color=et_color.getText().toString();
                double dpl=Double.parseDouble(et_distance.getText().toString());

                Car c=new Car(model,color,dpl);
                dp.insertCar(c);

            }
        });
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Car> cars =dp.getCars("2020");
                Toast.makeText(MainActivity2.this, "#"+cars.size(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}


