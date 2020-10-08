package com.test.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherTemperature {

    @JsonProperty("temp")
    private String temperature;

    @JsonProperty("feels_like")
    private String temperatureFeelsLike;
}
