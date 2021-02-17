package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class testlist extends AppCompatActivity {
    ListView lv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testlist);
        lv=findViewById(R.id.test_list);
        ArrayList<String> names=new ArrayList<>();
        names.add("hafiz");
        names.add("wafaa");
        names.add("mariam");
        names.add("mayar");
        names.add("hafiz");
        MyAdapter adapter=new MyAdapter(this,names);
        lv.setAdapter(adapter);


    }
}