package com.example.aninmationchauhoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ex4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex4);

        findViewById(R.id.button_back4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ex4.super.onBackPressed();
            }
        });
    }
}