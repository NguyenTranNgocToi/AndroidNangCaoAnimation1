package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class ex2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2);


        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        final ImageView imageView = findViewById(R.id.imageView2);

        final ImageView imageView1 = findViewById(R.id.imageView3);
        final ImageView imageView2 = findViewById(R.id.imageView4);
        final ImageView imageView3 = findViewById(R.id.imageView5);
        final ImageView imageView4 = findViewById(R.id.imageView6);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ex2.this, ex3.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ex2.this,imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent,optionsCompat.toBundle());
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ex2.this, ex4.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ex2.this,imageView1, ViewCompat.getTransitionName(imageView1));
                startActivity(intent,optionsCompat.toBundle());
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ex2.this, ex4.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ex2.this,imageView2, ViewCompat.getTransitionName(imageView2));
                startActivity(intent,optionsCompat.toBundle());
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ex2.this, ex4.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ex2.this,imageView3, ViewCompat.getTransitionName(imageView3));
                startActivity(intent,optionsCompat.toBundle());
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ex2.this, ex4.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ex2.this,imageView4, ViewCompat.getTransitionName(imageView4));
                startActivity(intent,optionsCompat.toBundle());
            }
        });



    }
}