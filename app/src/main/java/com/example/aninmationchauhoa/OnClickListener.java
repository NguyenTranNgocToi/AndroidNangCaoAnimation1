package com.example.aninmationchauhoa;

import android.widget.ImageView;
import android.widget.TextView;

public interface OnClickListener {
   // void itemClick(Music item);
    void itemClick(int pos, ImageView img, TextView song, TextView artist);
}
