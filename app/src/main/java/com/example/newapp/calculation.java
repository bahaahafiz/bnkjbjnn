package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculation extends AppCompatActivity {
    EditText et_first,et_secend;
    TextView  tv_result;
    Button btn_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        et_first=findViewById(R.id.calculate_tv_firstNumber);
        et_secend=findViewById(R.id.calculate_tv_secendNumber);
        tv_result=findViewById(R.id.calculate_tv_result);
        btn_sum=findViewById(R.id.calculate_btn);
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=et_first.getText().toString();
                String num2=et_secend.getText().toString();
                int number1=Integer.parseInt(num1);
                int number2=Integer.parseInt(num2);
                int result=number1+number2;
                tv_result.setText(result);

            }
        });

    }
}