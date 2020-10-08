package com.test.weather.mapper;

import com.test.weather.model.WeatherData;
import com.test.weather.model.WeatherDto;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper {

    public WeatherDto toDto(WeatherData weatherData) {
        return WeatherDto.builder()
                .condition(weatherData.getCondition().get(0).getCondition())
                .temperature(weatherData.getWeatherTemperature().getTemperature())
                .temperatureFeelsLike(weatherData.getWeatherTemperature().getTemperatureFeelsLike())
                .build();
    }
}
