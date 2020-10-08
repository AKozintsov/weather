package com.test.weather.service;

import com.test.weather.config.OpenWeatherMapProperties;
import com.test.weather.mapper.WeatherMapper;
import com.test.weather.model.WeatherData;
import com.test.weather.model.WeatherDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    private final OpenWeatherMapProperties openWeatherMapProperties;

    private final WeatherMapper weatherMapper;

    public WeatherDto getWeatherDataForCity(String cityName) {
        WeatherData weatherData = restTemplate.getForObject(openWeatherMapProperties.getWeatherForCityUrl(cityName), WeatherData.class);
        log.info("weather data: {}  ", weatherData);
        return weatherMapper.toDto(weatherData);
    }

}
