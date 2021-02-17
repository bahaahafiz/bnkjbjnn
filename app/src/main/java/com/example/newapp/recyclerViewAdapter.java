package com.example.newapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.catViewHolder> {
    ArrayList<cat>cats;

    public recyclerViewAdapter(ArrayList<cat> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public catViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_custum_item, null, false);
        catViewHolder viewHolder =new catViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull catViewHolder holder, int position) {
        cat c =cats.get(position);
        holder.IV_image.setImageResource(c.getImg());
        holder.tv_name.setText(c.getName());

    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    class catViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_name;
        ImageView IV_image;
        public catViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.cat_tv);
            IV_image=itemView.findViewById(R.id.cat_im);

        }
    }

}
