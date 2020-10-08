package com.test.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeatherData {

    @JsonProperty("weather")
    private List<Condition> condition;

    @JsonProperty("main")
    private WeatherTemperature weatherTemperature;

}
