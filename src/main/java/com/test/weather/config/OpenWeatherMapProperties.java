package com.test.weather.config;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
public class OpenWeatherMapProperties {

    @Value("${weathermap.api_key}")
    private String apiKey;

    public String getWeatherForCityUrl(String cityName) {
        return String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s", cityName, apiKey);
    }
}
