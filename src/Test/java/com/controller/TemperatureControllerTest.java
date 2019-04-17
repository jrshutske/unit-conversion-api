package com.controller;

import com.model.Temperature;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class TemperatureControllerTest {


    @Test
    public void convertFahrenheitTest() {
        TemperatureController tc = new TemperatureController();
        ResponseEntity<Temperature> tempObj = (ResponseEntity<Temperature>) tc.convertFahrenheit(1.0);

        Double actualFahrenheit = tempObj.getBody().getFahrenheit();
        Double actualCelsius = tempObj.getBody().getCelsius();
        Double actualKelvin = tempObj.getBody().getKelvin();

        Double expectedFahrenheit = 1.0;
        Double expectedCelsius = -17.22222222222222;
        Double expectedKelvin = 255.92777777777775;

        assertEquals(actualFahrenheit, expectedFahrenheit);
        assertEquals(actualCelsius, expectedCelsius);
        assertEquals(actualKelvin, expectedKelvin);

    }

    @Test
    public void convertCelsiusTest() {
        TemperatureController tc = new TemperatureController();
        ResponseEntity<Temperature> tempObj = (ResponseEntity<Temperature>) tc.convertCelsius(1.0);

        Double actualFahrenheit = tempObj.getBody().getFahrenheit();
        Double actualCelsius = tempObj.getBody().getCelsius();
        Double actualKelvin = tempObj.getBody().getKelvin();

        Double expectedFahrenheit = 33.8;
        Double expectedCelsius = 1.0;
        Double expectedKelvin = 274.15;

        assertEquals(actualFahrenheit, expectedFahrenheit);
        assertEquals(actualCelsius, expectedCelsius);
        assertEquals(actualKelvin, expectedKelvin);

    }

    @Test
    public void convertKelvinTest() {
        TemperatureController tc = new TemperatureController();
        ResponseEntity<Temperature> tempObj = (ResponseEntity<Temperature>) tc.convertKelvin(1.0);

        Double actualFahrenheit = tempObj.getBody().getFahrenheit();
        Double actualCelsius = tempObj.getBody().getCelsius();
        Double actualKelvin = tempObj.getBody().getKelvin();

        Double expectedFahrenheit = -457.86999999999995;
        Double expectedCelsius = -272.15;
        Double expectedKelvin = 1.0;

        assertEquals(actualFahrenheit, expectedFahrenheit);
        assertEquals(actualCelsius, expectedCelsius);
        assertEquals(actualKelvin, expectedKelvin);

    }

}