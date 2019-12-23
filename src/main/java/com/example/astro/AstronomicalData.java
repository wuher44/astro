package com.example.astro;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AstronomicalData {

    private String sunrise;
    private String sunset;
    private String sun_altitude;
    private String sun_azimuth;
    private String moonrise;
    private String moonset;
    private String moon_altitude;
    private String moon_azimuth;

    public AstronomicalData(@JsonProperty("sunrise") String sunrise, @JsonProperty("sunset") String sunset,
                            @JsonProperty("sun_altitude") String sun_altitude, @JsonProperty("sun_azimuth") String sun_azimuth,
                            @JsonProperty("moonrise") String moonrise, @JsonProperty("moonset") String moonset,
                            @JsonProperty("moon_altitude") String moon_altitude, @JsonProperty("moon_azimuth") String moon_azimuth) {
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.sun_altitude = sun_altitude;
        this.sun_azimuth = sun_azimuth;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moon_altitude = moon_altitude;
        this.moon_azimuth = moon_azimuth;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getSun_altitude() {
        return sun_altitude;
    }

    public String getSun_azimuth() {
        return sun_azimuth;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public String getMoon_altitude() {
        return moon_altitude;
    }

    public String getMoon_azimuth() {
        return moon_azimuth;
    }
}

