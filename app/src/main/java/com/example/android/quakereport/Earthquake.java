package com.example.android.quakereport;

/**
 * Created by Santi on 22/6/2017.
 */

public class Earthquake {

    //Private variables
    private Double mMagnitue;

    private String mPlace;

    private long mTime;

    private String mUrl;

    /**
     * Constructor for the Earthquake class
     * @param magnitude: magnitude of the earthquake.
     * @param place: place where it happened.
     * @param time: the date when it happened.
     * @param url: url for usgs site about the earthquake
     */
    public Earthquake (Double magnitude, String place, long time, String url) {

        //Set the values of the constructor to the variables
        mMagnitue = magnitude;
        mPlace = place;
        mTime = time;
        mUrl = url;
    }

    //Getters for the variables
    public Double getMagnitude(){
        return mMagnitue;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
