package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class uiComponent extends AppCompatActivity {
    Button btn_startActivity;
    EditText et_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_component);
        btn_startActivity=findViewById(R.id.ui_btn_startActivity);
       et_number = findViewById(R.id.ui_et_startActivity);
        btn_startActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=et_number.getText().toString();
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                Uri uri=Uri.parse("tel:"+number);
                intent.setData(uri);
                startActivity(intent);

            }
        });
    }
}