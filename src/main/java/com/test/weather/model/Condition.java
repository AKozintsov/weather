package com.test.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Condition {

    @JsonProperty("main")
    private String condition;

}
