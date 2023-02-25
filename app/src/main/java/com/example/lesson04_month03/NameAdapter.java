package com.example.lesson04_month03;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private ArrayList<String> names;
    private ItemClickListener listener;

    public NameAdapter(ArrayList<String>names,ItemClickListener listener){
        this.names=names;
        this.listener=listener;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itm_name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, @SuppressLint("RecyclerView") int position) {
     holder.bind(names.get(position));

     holder.itemContainer.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             listener.itemClickListener(names.get(position));
         }
     });

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
