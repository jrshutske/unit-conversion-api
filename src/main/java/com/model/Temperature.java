package com.model;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Temperature.
 */
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

    /**
     * Instantiates a new Temperature.
     */
    public Temperature(){}

}