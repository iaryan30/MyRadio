package com.example.android.myradio.model;

public class Station {
    final String Drawable="drawable/";
    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle=stationTitle;
        this.imgUri= imgUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return Drawable + imgUri;
    }

}
