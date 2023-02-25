package com.example.lesson04_month03;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    TextView nameTv;

    LinearLayout itemContainer;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.name_tv);
        itemContainer=itemView.findViewById(R.id.name_ct);
    }
    public void bind(String name){
        nameTv.setText(name);
    }
}
