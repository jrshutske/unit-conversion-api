package com.model;

import lombok.Getter;
import lombok.Setter;

public class Temperature {

    @Getter
    @Setter
    private int fahrenheit;

    @Getter
    @Setter
    private int celsius;

    @Getter
    @Setter
    private int kelvin;

    public Temperature(){}

}