package com.controller;

import com.model.Volume;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class VolumeControllerTest {


    @Test
    public void convertGallonTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertGallon(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 1.0;
        Double expectedLiter = 3.78541178;
        Double expectedQuart = 4.0;
        Double expectedPint = 7.99999954;
        Double expectedCup = 16.004715;
        Double expectedMilliliter = 3785.41178;
        Double expectedFluidOunce = 128.000128;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

    @Test
    public void convertLiterTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertLiter(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 0.26417205236;
        Double expectedLiter = 1.0;
        Double expectedQuart = 1.05668821;
        Double expectedPint = 2.1133763;
        Double expectedCup = 4.2279984;
        Double expectedMilliliter = 1000.0;
        Double expectedFluidOunce = 33.8140565;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

    @Test
    public void convertQuartTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertQuart(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 0.25;
        Double expectedLiter = 0.946352946;
        Double expectedQuart = 1.0;
        Double expectedPint = 1.99999989;
        Double expectedCup = 4.00117874;
        Double expectedMilliliter = 946.352946;
        Double expectedFluidOunce = 32.000032;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

    @Test
    public void convertPintTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertPint(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 0.12500000713;
        Double expectedLiter = 0.4731765;
        Double expectedQuart = 0.50000002853;
        Double expectedPint = 1.0;
        Double expectedCup = 2.00058948;
        Double expectedMilliliter = 473.1765;
        Double expectedFluidOunce = 16.0000169;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

    @Test
    public void convertCupTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertCup(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 0.0624815876;
        Double expectedLiter = 0.236518538;
        Double expectedQuart = 0.24992635042;
        Double expectedPint = 0.49985267231;
        Double expectedCup = 1.0;
        Double expectedMilliliter = 236.518538;
        Double expectedFluidOunce = 7.99765121;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

    @Test
    public void convertMilliliterTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertMilliliter(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 0.00026417205;
        Double expectedLiter = 0.001;
        Double expectedQuart = 0.00105668821;
        Double expectedPint = 0.0021133763;
        Double expectedCup = 0.0042279984;
        Double expectedMilliliter = 1.0;
        Double expectedFluidOunce = 0.0338140565;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

    @Test
    public void convertFluidOunceTest() {
        VolumeController vc = new VolumeController();
        ResponseEntity<Volume> volumeObj = (ResponseEntity<Volume>) vc.convertFluidOunce(1.0);

        Double actualGallon = volumeObj.getBody().getGallon();
        Double actualLiter = volumeObj.getBody().getLiter();
        Double actualQuart = volumeObj.getBody().getQuart();
        Double actualPint = volumeObj.getBody().getPint();
        Double actualCup = volumeObj.getBody().getCup();
        Double actualMilliliter = volumeObj.getBody().getMilliliter();
        Double actualFluidOunce = volumeObj.getBody().getFluidOunce();

        Double expectedGallon = 0.00781249219;
        Double expectedLiter = 0.0295735;
        Double expectedQuart = 0.03124996876;
        Double expectedPint = 0.06249993396;
        Double expectedCup = 0.12503671065;
        Double expectedMilliliter = 29.5735;
        Double expectedFluidOunce = 1.0;

        assertEquals(actualGallon, expectedGallon);
        assertEquals(actualLiter, expectedLiter);
        assertEquals(actualQuart, expectedQuart);
        assertEquals(actualPint, expectedPint);
        assertEquals(actualCup, expectedCup);
        assertEquals(actualMilliliter, expectedMilliliter);
        assertEquals(actualFluidOunce, expectedFluidOunce);

    }

}