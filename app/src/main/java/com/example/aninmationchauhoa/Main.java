package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;


public class Main extends AppCompatActivity implements OnClickListener {

    private RecyclerView rlc;
    private Adapter_song adapter;
    private ArrayList<music> arrayList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        rlc = findViewById(R.id.rlc);
        arrayList = new ArrayList<>();

        arrayList.add(new music(R.drawable.tayler,"Love Story","Taylor Swift"));
        arrayList.add(new music(R.drawable.tayler,"Love Story","Taylor Swift"));
        arrayList.add(new music(R.drawable.tayler,"Love Story","Taylor Swift"));
        arrayList.add(new music(R.drawable.tayler,"Love Story","Taylor Swift"));
        arrayList.add(new music(R.drawable.tayler,"Love Story","Taylor Swift"));
        arrayList.add(new music(R.drawable.tayler,"Love Story","Taylor Swift"));

        adapter = new Adapter_song(this, arrayList,this);
        rlc.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rlc.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void itemClick(music item) {

    }
}