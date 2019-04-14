package com.model;

import lombok.Getter;
import lombok.Setter;

public class Temperature {

    @Getter
    @Setter
    private Double fahrenheit;

    @Getter
    @Setter
    private Double celsius;

    @Getter
    @Setter
    private Double kelvin;

    public Temperature(){}

}