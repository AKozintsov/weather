package com.test.weather.handler;

import com.test.weather.exception.CityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(CityNotFoundException.class)
    public String handleCityNotFound(CityNotFoundException cityNotFoundException, Model model, HttpServletRequest request) {
        log.info("exception handled: {}", cityNotFoundException.getMessage());
        model.addAttribute("errorMessage", String.format("city: %s was not found", request.getParameter("city")));
        return "weather";
    }
}
