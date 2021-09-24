package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ex3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3);


        findViewById(R.id.button_back3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ex3.super.onBackPressed();
            }
        });
    }
}