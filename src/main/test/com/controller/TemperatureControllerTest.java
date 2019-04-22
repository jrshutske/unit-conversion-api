package com.controller;

import com.model.Temperature;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class TemperatureControllerTest {

    TemperatureController tc = new TemperatureController();

    Double actualFahrenheit;
    Double actualCelsius;
    Double actualKelvin;

    Double expectedFahrenheit;
    Double expectedCelsius;
    Double expectedKelvin;

    @Test
    public void convertFahrenheitTest() {
        ResponseEntity<Temperature> tempObj = (ResponseEntity<Temperature>) tc.convertFahrenheit(1.0);

        actualFahrenheit = tempObj.getBody().getFahrenheit();
        actualCelsius = tempObj.getBody().getCelsius();
        actualKelvin = tempObj.getBody().getKelvin();

        expectedFahrenheit = 1.0;
        expectedCelsius = -17.22222222222222;
        expectedKelvin = 255.92777777777775;

        assertEquals(actualFahrenheit,expectedFahrenheit);
        assertEquals(actualCelsius,expectedCelsius);
        assertEquals(actualKelvin,expectedKelvin);
    }

    @Test
    public void convertCelsiusTest() {
        ResponseEntity<Temperature> tempObj = (ResponseEntity<Temperature>) tc.convertCelsius(1.0);

        actualFahrenheit = tempObj.getBody().getFahrenheit();
        actualCelsius = tempObj.getBody().getCelsius();
        actualKelvin = tempObj.getBody().getKelvin();

        expectedFahrenheit = 33.8;
        expectedCelsius = 1.0;
        expectedKelvin = 274.15;

        assertEquals(actualFahrenheit,expectedFahrenheit);
        assertEquals(actualCelsius,expectedCelsius);
        assertEquals(actualKelvin,expectedKelvin);
    }

    @Test
    public void convertKelvinTest() {
        ResponseEntity<Temperature> tempObj = (ResponseEntity<Temperature>) tc.convertKelvin(1.0);

        actualFahrenheit = tempObj.getBody().getFahrenheit();
        actualCelsius = tempObj.getBody().getCelsius();
        actualKelvin = tempObj.getBody().getKelvin();

        expectedFahrenheit = -457.86999999999995;
        expectedCelsius = -272.15;
        expectedKelvin = 1.0;

        assertEquals(actualFahrenheit,expectedFahrenheit);
        assertEquals(actualCelsius,expectedCelsius);
        assertEquals(actualKelvin,expectedKelvin);
    }
}