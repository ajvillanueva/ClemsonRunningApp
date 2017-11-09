package com.clemsonrun.runningapp.model;

/**
 * Created by CJ on 11/9/2017.
 */

public class Landmark {

    private float lon, lat;
    private String name;

    public Landmark (float longi, float lati, String calls){
        this.lon = longi;
        this.lat = lati;
        this.name = calls;
    }

    public float getLon(){
        return lon;
    }

    public float getLat(){
        return lat;
    }

    public String getName(){
        return name;
    }
}
