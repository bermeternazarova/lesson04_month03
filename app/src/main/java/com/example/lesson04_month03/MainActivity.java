package com.example.lesson04_month03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView namesRecyclerview;
    private ArrayList<String>names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names=new ArrayList<>();
        namesRecyclerview=findViewById(R.id.names_rv);
        setNames();
        namesRecyclerview.setAdapter(new NameAdapter(names,this));
    }
    private void setNames(){
        names.add("Bermet");
        names.add("Muhammad");
        names.add("Azamat");
        names.add("Ilya");
        names.add("Alim");
        names.add("Ayana");
        names.add("Diana");
        names.add("Ahmad");
        names.add("Akbar");
        names.add("Timur");
        names.add("Aziz");
    }

    @Override
    public void itemClickListener(String name) {

    }
}