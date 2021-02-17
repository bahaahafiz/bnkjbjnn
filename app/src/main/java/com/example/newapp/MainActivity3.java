package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<cat> cats =new ArrayList<>();
        cats.add(new cat(R.drawable.pp,"bahaa"));
        cats.add(new cat(R.drawable.pp,"wafaa"));
        cats.add(new cat(R.drawable.pp,"asmaa"));

        recyclerViewAdapter adapter=new recyclerViewAdapter(cats);
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}