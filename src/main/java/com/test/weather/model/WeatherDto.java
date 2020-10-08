package com.test.weather.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeatherDto {

    private String condition;

    private String temperature;

    private String temperatureFeelsLike;

}
