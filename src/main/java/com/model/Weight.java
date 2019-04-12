package com.model;

import lombok.Getter;
import lombok.Setter;

public class Weight {

    @Getter
    @Setter
    private int stone;

    @Getter
    @Setter
    private int pound;

    @Getter
    @Setter
    private int kilogram;

    @Getter
    @Setter
    private int gram;

    @Getter
    @Setter
    private int ounce;

    @Getter
    @Setter
    private int milligram;

    public Weight(){}
}