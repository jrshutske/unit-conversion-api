package com.controller;

import com.model.Length;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class LengthControllerTest {

    LengthController lc = new LengthController();
    Double actualMile;
    Double actualCentimeter;
    Double actualFoot;
    Double actualInch;
    Double actualKilometer;
    Double actualMeter;
    Double actualMillimeter;
    Double actualYard;

    Double expectedMile;
    Double expectedCentimeter;
    Double expectedFoot;
    Double expectedInch;
    Double expectedKilometer;
    Double expectedMeter;
    Double expectedMillimeter;
    Double expectedYard;

    @Test
    public void convertMileTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertMile(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 1.0;
        expectedCentimeter = 160934.4;
        expectedFoot = 5280.0;
        expectedInch = 63360.0;
        expectedKilometer = 1.609;
        expectedMeter = 1609.344;
        expectedMillimeter = 1.609e+6;
        expectedYard = 1760.0;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertKilometerTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertKilometer(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 0.62137119224;
        expectedCentimeter = 100000.0;
        expectedFoot = 3280.84;
        expectedInch = 39370.079;
        expectedKilometer = 1.0;
        expectedMeter = 1000.0;
        expectedMillimeter = 1000000.0;
        expectedYard = 1093.613;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertYardTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertYard(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 0.00056818182;
        expectedCentimeter = 91.44;
        expectedFoot = 3.0;
        expectedInch = 36.0;
        expectedKilometer = 0.0009144;
        expectedMeter = 0.9144;
        expectedMillimeter = 914.4;
        expectedYard = 1.0;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertMeterTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertMeter(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 0.00062137119;
        expectedCentimeter = 100.0;
        expectedFoot = 3.281;
        expectedInch = 39.37;
        expectedKilometer = 0.001;
        expectedMeter = 1.0;
        expectedMillimeter = 1000.0;
        expectedYard = 1.094;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertFootTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertFoot(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 0.00018939394;
        expectedCentimeter = 30.48;
        expectedFoot = 1.0;
        expectedInch = 12.0;
        expectedKilometer = 0.0003048;
        expectedMeter = 0.3048;
        expectedMillimeter = 304.8;
        expectedYard = 0.333333;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertInchTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertInch(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 1.5782828e-5;
        expectedCentimeter = 2.54;
        expectedFoot = 0.0833333;
        expectedInch = 1.0;
        expectedKilometer = 2.54e-5;
        expectedMeter = 0.0254;
        expectedMillimeter = 25.4;
        expectedYard = 0.02777777778;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertCentimeterTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertCentimeter(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 6.2137119e-6;
        expectedCentimeter = 1.0;
        expectedFoot = 0.03280839895;
        expectedInch = 0.3937007874;
        expectedKilometer = 1.0e-5;
        expectedMeter = 0.01;
        expectedMillimeter = 10.0;
        expectedYard = 0.01093613298;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }

    @Test
    public void convertMillimeterTest() {
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertMillimeter(1.0);

        actualMile = lengthObj.getBody().getMile();
        actualCentimeter = lengthObj.getBody().getCentimeter();
        actualFoot = lengthObj.getBody().getFoot();
        actualInch = lengthObj.getBody().getInch();
        actualKilometer = lengthObj.getBody().getKilometer();
        actualMeter = lengthObj.getBody().getMeter();
        actualMillimeter = lengthObj.getBody().getMillimeter();
        actualYard = lengthObj.getBody().getYard();

        expectedMile = 6.2137119e-7;
        expectedCentimeter = 0.1;
        expectedFoot = 0.0032808399;
        expectedInch = 0.03937007874;
        expectedKilometer = 1e-6;
        expectedMeter = 0.001;
        expectedMillimeter = 1.0;
        expectedYard = 0.0010936133;

        assertEquals(actualMile,expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot,expectedFoot);
        assertEquals(actualInch,expectedInch);
        assertEquals(actualKilometer,expectedKilometer);
        assertEquals(actualMeter,expectedMeter);
        assertEquals(actualMillimeter,expectedMillimeter);
        assertEquals(actualYard,expectedYard);
    }
}
