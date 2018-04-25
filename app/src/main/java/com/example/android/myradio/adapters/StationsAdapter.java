package com.example.android.myradio.adapters;

import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.myradio.Activities.MainActivity;
import com.example.android.myradio.R;
import com.example.android.myradio.holders.StationViewHolder;
import com.example.android.myradio.model.Station;

import java.util.ArrayList;

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(@NonNull StationViewHolder holder, final int position) {
        final Station station=stations.get(position);
        holder.uppdateUI(station);
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //load the details
               MainActivity.getMainActivity().loadDetailsScreen(station);
           }
       });

    }

    @Override
    public int getItemCount()
    {
        return stations.size();
    }

    @NonNull
    @Override
    public StationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stationCard= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station,parent,false);
        return new StationViewHolder(stationCard) ;
    }
}

