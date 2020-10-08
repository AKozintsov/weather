package com.test.weather.controller;

import com.test.weather.model.WeatherDto;
import com.test.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Slf4j
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public String getWeatherHomePage() {
        return "weather";
    }

    @GetMapping("/weather")
    public String getWeatherForCity(@RequestParam String city, Model model) {
        WeatherDto weatherDto = weatherService.getWeatherDataForCity(city);
        model.addAttribute(weatherService.getWeatherDataForCity(city));
        log.info("Weather DTO object received: {} for city: {}", weatherDto, city);
        return "weather";
    }
}
