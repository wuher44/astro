package com.example.astro;


import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.JacksonObjectMapper;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

//https://api.ipgeolocation.io/astronomy?apiKey=API_KEY&lat=-27.4748&long=153.017&date=2018-01-01
//http://data.fixer.io/api/2019-06-30?access_key=acbc96c064ef32725ac5dbe0a2e41942&symbols=USD,
// GBP,PLN
@Service
public class AstronomyApiClient {
    public DataResponse getData(LocalDate date, double lat, double longi) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);

        Unirest.config().setObjectMapper(new JacksonObjectMapper(mapper));

        AstronomyClientResponse response = Unirest.get("https://api.ipgeolocation.io/astronomy")
                .queryString("apiKey", "409d4596f9834ff2b44f7dd2e2af605d")
                .queryString("lat", lat)
                .queryString("long", longi)
                .queryString("date", date)
                .asObject(AstronomyClientResponse.class)
                .getBody();
        System.out.println(date);
        DataResponse dataResponse = apiToData(response);
        return dataResponse;
    }

    private DataResponse apiToData(AstronomyClientResponse response) {
        Map<String, String> astroData = new HashMap<>();
        astroData.put("sunrise", response.getSunrise());
        astroData.put("sunset", response.getSunset());
        astroData.put("sun_altitude", response.getSun_altitude());
        astroData.put("sun_azimuth", response.getSun_azimuth());
        astroData.put("moonrise", response.getMoonrise());
        astroData.put("moonset", response.getMoonset());
        astroData.put("moon_altitude", response.getMoon_altitude());
        astroData.put("moon_azimuth", response.getMoon_azimuth());
        return new DataResponse(astroData);
    }
}
