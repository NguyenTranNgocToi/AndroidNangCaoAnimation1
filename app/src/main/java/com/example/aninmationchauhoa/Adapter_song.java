package com.example.aninmationchauhoa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_song extends RecyclerView.Adapter<Adapter_song.ThingViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<music> arrayList;
    private OnClickListener listener;

    public Adapter_song(Context context,  ArrayList<music> arrayList, OnClickListener listener) {
       // this.context = context;
        this.layoutInflater = layoutInflater.from(context);
        this.arrayList = arrayList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Adapter_song.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item, parent, false);
        return new ThingViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_song.ThingViewHolder holder, int position) {
        holder.item = arrayList.get(position);
        holder.tvSong.setText(arrayList.get(position).getSong());
        holder.tvArtist.setText(arrayList.get(position).getArtist());
        holder.imageView.setImageResource(arrayList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
            return arrayList.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        music item;
        TextView tvSong, tvArtist;
        ImageView imageView;
        Adapter_song song_adapter;
        public ThingViewHolder(@NonNull View itemView, Adapter_song item_adapter) {
            super(itemView);
            tvSong = itemView.findViewById(R.id.textView_Song);
            tvArtist = itemView.findViewById(R.id.textView_artist);
            imageView = itemView.findViewById(R.id.imageArtist);
            this.song_adapter = item_adapter;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.itemClick(item);
                }
            });
        }
    }
}
