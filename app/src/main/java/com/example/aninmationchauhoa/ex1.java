package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ex1 extends AppCompatActivity {
    ImageView img;
    TextView artist, song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1);

        img = findViewById(R.id.imageView11);
        artist = findViewById(R.id.textView2);
        song =findViewById(R.id.textView);
        Music item = (Music) getIntent().getExtras().getSerializable("song");

        img.setImageResource(item.getImg());
        artist.setText(item.getArtist());
        song.setText(item.getSong());

    }


}