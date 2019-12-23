package com.example.astro;

import java.util.Map;

public class DataResponse {

    private Map<String, String> astroData;

    public DataResponse(Map<String, String> astroData) {
        this.astroData = astroData;
    }

    public Map<String, String> getAstroData() {
        return astroData;
    }
}

