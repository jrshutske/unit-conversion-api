package com.controller;

import com.model.Length;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

/**
 * The type Length controller test. This is a unit test for the LengthController class.
 */
public class LengthControllerTest {


    /**
     * Convert mile test.
     */
    @Test
    public void convertMileTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertMile(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 1.0;
        Double expectedCentimeter = 160934.4;
        Double expectedFoot = 5280.0;
        Double expectedInch = 63360.0;
        Double expectedKilometer = 1.609;
        Double expectedMeter = 1609.344;
        Double expectedMillimeter = 1.609e+6;
        Double expectedYard = 1760.0;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert kilometer test.
     */
    @Test
    public void convertKilometerTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertKilometer(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 0.62137119224;
        Double expectedCentimeter = 100000.0;
        Double expectedFoot = 3280.84;
        Double expectedInch = 39370.079;
        Double expectedKilometer = 1.0;
        Double expectedMeter = 1000.0;
        Double expectedMillimeter = 1000000.0;
        Double expectedYard = 1093.613;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert yard test.
     */
    @Test
    public void convertYardTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertYard(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 0.00056818182;
        Double expectedCentimeter = 91.44;
        Double expectedFoot = 3.0;
        Double expectedInch = 36.0;
        Double expectedKilometer = 0.0009144;
        Double expectedMeter = 0.9144;
        Double expectedMillimeter = 914.4;
        Double expectedYard = 1.0;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert meter test.
     */
    @Test
    public void convertMeterTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertMeter(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 0.00062137119;
        Double expectedCentimeter = 100.0;
        Double expectedFoot = 3.281;
        Double expectedInch = 39.37;
        Double expectedKilometer = 0.001;
        Double expectedMeter = 1.0;
        Double expectedMillimeter = 1000.0;
        Double expectedYard = 1.094;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert foot test.
     */
    @Test
    public void convertFootTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertFoot(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 0.00018939394;
        Double expectedCentimeter = 30.48;
        Double expectedFoot = 1.0;
        Double expectedInch = 12.0;
        Double expectedKilometer = 0.0003048;
        Double expectedMeter = 0.3048;
        Double expectedMillimeter = 304.8;
        Double expectedYard = 0.333333;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert inch test.
     */
    @Test
    public void convertInchTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertInch(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 1.5782828e-5;
        Double expectedCentimeter = 2.54;
        Double expectedFoot = 0.0833333;
        Double expectedInch = 1.0;
        Double expectedKilometer = 2.54e-5;
        Double expectedMeter = 0.0254;
        Double expectedMillimeter = 25.4;
        Double expectedYard = 0.02777777778;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert centimeter test.
     */
    @Test
    public void convertCentimeterTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertCentimeter(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 6.2137119e-6;
        Double expectedCentimeter = 1.0;
        Double expectedFoot = 0.03280839895;
        Double expectedInch = 0.3937007874;
        Double expectedKilometer = 1.0e-5;
        Double expectedMeter = 0.01;
        Double expectedMillimeter = 10.0;
        Double expectedYard = 0.01093613298;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }

    /**
     * Convert millimeter test.
     */
    @Test
    public void convertMillimeterTest() {
        LengthController lc = new LengthController();
        ResponseEntity<Length> lengthObj = (ResponseEntity<Length>)lc.convertMillimeter(1.0);

        Double actualMile = lengthObj.getBody().getMile();
        Double actualCentimeter = lengthObj.getBody().getCentimeter();
        Double actualFoot = lengthObj.getBody().getFoot();
        Double actualInch = lengthObj.getBody().getInch();
        Double actualKilometer = lengthObj.getBody().getKilometer();
        Double actualMeter = lengthObj.getBody().getMeter();
        Double actualMillimeter = lengthObj.getBody().getMillimeter();
        Double actualYard = lengthObj.getBody().getYard();

        Double expectedMile = 6.2137119e-7;
        Double expectedCentimeter = 0.1;
        Double expectedFoot = 0.0032808399;
        Double expectedInch = 0.03937007874;
        Double expectedKilometer = 1e-6;
        Double expectedMeter = 0.001;
        Double expectedMillimeter = 1.0;
        Double expectedYard = 0.0010936133;

        assertEquals(actualMile, expectedMile);
        assertEquals(actualCentimeter,expectedCentimeter);
        assertEquals(actualFoot, expectedFoot);
        assertEquals(actualInch, expectedInch);
        assertEquals(actualKilometer, expectedKilometer);
        assertEquals(actualMeter, expectedMeter);
        assertEquals(actualMillimeter, expectedMillimeter);
        assertEquals(actualYard, expectedYard);

    }
}
