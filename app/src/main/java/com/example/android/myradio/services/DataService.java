package com.example.android.myradio.services;

import com.example.android.myradio.model.Station;

import java.util.ArrayList;

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }
    public ArrayList<Station> getFeaturedStations(){
        //pretend we just downloaded featured stations from the internet
        ArrayList<Station> list= new ArrayList<>();
        list.add(new Station("Flight Plan(Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin(Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams(Music for Children)","kidsmusic"));
        return list;
    }

    public ArrayList<Station> getRecentStations(){
        ArrayList<Station> list= new ArrayList<>();
        list.add(new Station("Prime-Time(Primary Playlist)","vinylmusic"));
        list.add(new Station("Chit-Chatting(Social Playlist)","socialmusic"));
        list.add(new Station("Just Relax(Music for relaxing)","keymusic"));
        return list;
    }

    public ArrayList<Station> getPartyStations(){
        ArrayList<Station> list= new ArrayList<>();
        list.add(new Station("Flight Plan(Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin(Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams(Music for Children)","kidsmusic"));
        return list;
    }
}
