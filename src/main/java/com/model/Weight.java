package com.model;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Weight.
 */
public class Weight {

    @Getter
    @Setter
    private Double stone;

    @Getter
    @Setter
    private Double pound;

    @Getter
    @Setter
    private Double kilogram;

    @Getter
    @Setter
    private Double gram;

    @Getter
    @Setter
    private Double ounce;

    @Getter
    @Setter
    private Double milligram;

    /**
     * Instantiates a new Weight.
     */
    public Weight(){}
}