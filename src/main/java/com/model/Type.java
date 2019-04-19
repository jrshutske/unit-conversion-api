package com.model;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Type.
 */
public class Type {

    @Getter
    @Setter
    private int length;

    @Getter
    @Setter
    private int temperature;

    @Getter
    @Setter
    private int volume;

    @Getter
    @Setter
    private int weight;

    /**
     * Instantiates a new Type.
     */
    public Type(){}
}