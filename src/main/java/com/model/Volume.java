package com.model;

import lombok.Getter;
import lombok.Setter;

public class Volume {

    @Getter
    @Setter
    private int gallon;

    @Getter
    @Setter
    private int liter;

    @Getter
    @Setter
    private int quart;

    @Getter
    @Setter
    private int pint;

    @Getter
    @Setter
    private int cup;

    @Getter
    @Setter
    private int milliliter;

    @Getter
    @Setter
    private int fluidOunce;

    public Volume(){}
}