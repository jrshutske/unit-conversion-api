package com.model;

import lombok.Getter;
import lombok.Setter;

public class Volume {

    @Getter
    @Setter
    private Double gallon;

    @Getter
    @Setter
    private Double liter;

    @Getter
    @Setter
    private Double quart;

    @Getter
    @Setter
    private Double pint;

    @Getter
    @Setter
    private Double cup;

    @Getter
    @Setter
    private Double milliliter;

    @Getter
    @Setter
    private Double fluidOunce;

    public Volume(){}
}