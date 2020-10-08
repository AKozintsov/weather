package com.test.weather.exception;

import java.io.IOException;

public class CityNotFoundException extends IOException {

    public CityNotFoundException(String message) {
        super(message);
    }

}
