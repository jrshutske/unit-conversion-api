package com.controller;

import com.model.Volume;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class VolumeControllerTest {

    VolumeController vc = new VolumeController();

    Double actualGallon;
    Double actualLiter;
    Double actualQuart;
    Double actualPint;
    Double actualCup;
    Double actualMilliliter;
    Double actualFluidOunce;

    Double expectedGallon;
    Double expectedLiter;
    Double expectedQuart;
    Double expectedPint;
    Double expectedCup;
    Double expectedMilliliter;
    Double expectedFluidOunce;

    @Test
    public void convertGallonTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertGallon(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 1.0;
        expectedLiter = 3.78541178;
        expectedQuart = 4.0;
        expectedPint = 7.99999954;
        expectedCup = 16.004715;
        expectedMilliliter = 3785.41178;
        expectedFluidOunce = 128.000128;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);

    }

    @Test
    public void convertLiterTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertLiter(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 0.26417205236;
        expectedLiter = 1.0;
        expectedQuart = 1.05668821;
        expectedPint = 2.1133763;
        expectedCup = 4.2279984;
        expectedMilliliter = 1000.0;
        expectedFluidOunce = 33.8140565;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);

    }

    @Test
    public void convertQuartTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertQuart(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 0.25;
        expectedLiter = 0.946352946;
        expectedQuart = 1.0;
        expectedPint = 1.99999989;
        expectedCup = 4.00117874;
        expectedMilliliter = 946.352946;
        expectedFluidOunce = 32.000032;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);

    }

    @Test
    public void convertPintTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertPint(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 0.12500000713;
        expectedLiter = 0.4731765;
        expectedQuart = 0.50000002853;
        expectedPint = 1.0;
        expectedCup = 2.00058948;
        expectedMilliliter = 473.1765;
        expectedFluidOunce = 16.0000169;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);

    }

    @Test
    public void convertCupTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertCup(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 0.0624815876;
        expectedLiter = 0.236518538;
        expectedQuart = 0.24992635042;
        expectedPint = 0.49985267231;
        expectedCup = 1.0;
        expectedMilliliter = 236.518538;
        expectedFluidOunce = 7.99765121;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);
    }

    @Test
    public void convertMilliliterTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertMilliliter(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 0.00026417205;
        expectedLiter = 0.001;
        expectedQuart = 0.00105668821;
        expectedPint = 0.0021133763;
        expectedCup = 0.0042279984;
        expectedMilliliter = 1.0;
        expectedFluidOunce = 0.0338140565;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);
    }

    @Test
    public void convertFluidOunceTest() {
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertFluidOunce(1.0);

        actualGallon = volumeObj.getBody().getGallon();
        actualLiter = volumeObj.getBody().getLiter();
        actualQuart = volumeObj.getBody().getQuart();
        actualPint = volumeObj.getBody().getPint();
        actualCup = volumeObj.getBody().getCup();
        actualMilliliter = volumeObj.getBody().getMilliliter();
        actualFluidOunce = volumeObj.getBody().getFluidOunce();

        expectedGallon = 0.00781249219;
        expectedLiter = 0.0295735;
        expectedQuart = 0.03124996876;
        expectedPint = 0.06249993396;
        expectedCup = 0.12503671065;
        expectedMilliliter = 29.5735;
        expectedFluidOunce = 1.0;

        assertEquals(actualGallon,expectedGallon);
        assertEquals(actualLiter,expectedLiter);
        assertEquals(actualQuart,expectedQuart);
        assertEquals(actualPint,expectedPint);
        assertEquals(actualCup,expectedCup);
        assertEquals(actualMilliliter,expectedMilliliter);
        assertEquals(actualFluidOunce,expectedFluidOunce);
    }
}