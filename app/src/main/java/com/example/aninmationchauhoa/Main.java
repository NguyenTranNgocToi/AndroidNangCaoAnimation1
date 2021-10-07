package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


import androidx.core.util.Pair;



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

      // adapter = new Adapter_song(this, arrayList,this);
        adapter = new Adapter_song(this, arrayList, this);
        rlc.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rlc.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void itemClick(int pos, ImageView img, TextView song, TextView artist) {
      Intent intent = new Intent(this, ex1.class);
        intent.putExtra("song", arrayList.get(pos));



        Pair<View, String> p1 = Pair.create((View)img,"img");
        Pair<View, String> p2 = Pair.create((View)artist,"artist");
        Pair<View, String> p3 = Pair.create((View)song,"song");

        Fade imgF = new Fade();
        Fade artistF = new Fade();
        Fade songF = new Fade();

        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(imgF);


        Toast.makeText(this, song.toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, artist.toString(), Toast.LENGTH_SHORT).show();
    }

}