package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


import androidx.core.util.Pair;



public class Main extends AppCompatActivity implements OnClickListener {

    private RecyclerView rlc;
    private Adapter_song adapter;
    private ArrayList<Music> arrayList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


           rlc = findViewById(R.id.rlc);
        arrayList = new ArrayList<>();

        arrayList.add(new Music(R.drawable.tayler,"Love Story","Taylor Swift"));
        arrayList.add(new Music(R.drawable.tayler,"Love Story1","Taylor Swift1"));
        arrayList.add(new Music(R.drawable.tayler,"Love Story2","Taylor Swift2"));
        arrayList.add(new Music(R.drawable.tayler,"Love Story3","Taylor Swift3"));
        arrayList.add(new Music(R.drawable.tayler,"Love Story4","Taylor Swift4"));
        arrayList.add(new Music(R.drawable.tayler,"Love Story5","Taylor Swift5"));

      // adapter = new Adapter_song(this, arrayList,this);
        adapter = new Adapter_song(this, arrayList, this);
        rlc.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rlc.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void itemClick(int pos, ImageView img, TextView song, TextView artist) {

        Intent intent = new Intent(Main.this, ex1.class);



       intent.putExtra("song", arrayList.get(pos));



        Pair<View, String> p1 = Pair.create((View)img,"img");
        Pair<View, String> p2 = Pair.create((View)artist,"artist");
        Pair<View, String> p3 = Pair.create((View)song,"song");

        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1,p2,p3);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
            startActivity(intent, optionsCompat.toBundle());
        }else
            startActivity(intent);

    }

}