package com.example.astro;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    double lat;
    double longi;

    public Location(@JsonProperty("lat") double lat, @JsonProperty("long") double longi) {
        this.lat = lat;
        this.longi = longi;
    }

    public double getLat() {
        return lat;
    }

    public double getLongi() {
        return longi;
    }
}
