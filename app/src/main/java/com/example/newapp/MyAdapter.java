package com.example.newapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> data;

    public MyAdapter(Context c, ArrayList<String> data) {
        this.context=c;
        this.data=data;

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView ==null)
                {
                    LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null,false);
                }


        TextView tv= convertView.findViewById(android.R.id.text1);
                String name =data.get(position);
                tv.setText(name);

        return convertView;
    }
}
