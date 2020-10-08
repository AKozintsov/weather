package com.test.weather.config;

import com.test.weather.exception.CityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return clientHttpResponse.getStatusCode().equals(HttpStatus.NOT_FOUND);
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        if (clientHttpResponse.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
            throw new CityNotFoundException(clientHttpResponse.getStatusText());
        }
    }
}
