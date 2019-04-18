package com.controller;

import com.model.Weight;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class WeightControllerTest {


    @Test
    public void convertStoneTest() {
        WeightController wc = new WeightController();
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertStone(1.0);

        Double actualStone = weightObj.getBody().getStone();
        Double actualPound = weightObj.getBody().getPound();
        Double actualKilogram = weightObj.getBody().getKilogram();
        Double actualGram = weightObj.getBody().getGram();
        Double actualMilligram = weightObj.getBody().getMilligram();
        Double actualOunce = weightObj.getBody().getOunce();

        Double expectedStone = 1.0;
        Double expectedPound = 14.0;
        Double expectedKilogram = 6.35029318;
        Double expectedGram = 6350.29318;
        Double expectedMilligram = 6350293.18;
        Double expectedOunce = 224.0;

        assertEquals(actualStone, expectedStone);
        assertEquals(actualPound, expectedPound);
        assertEquals(actualKilogram, expectedKilogram);
        assertEquals(actualGram, expectedGram);
        assertEquals(actualMilligram, expectedMilligram);
        assertEquals(actualOunce, expectedOunce);

    }

    @Test
    public void convertPoundTest() {
        WeightController wc = new WeightController();
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertPound(1.0);

        Double actualStone = weightObj.getBody().getStone();
        Double actualPound = weightObj.getBody().getPound();
        Double actualKilogram = weightObj.getBody().getKilogram();
        Double actualGram = weightObj.getBody().getGram();
        Double actualMilligram = weightObj.getBody().getMilligram();
        Double actualOunce = weightObj.getBody().getOunce();

        Double expectedStone = 0.07142857143;
        Double expectedPound = 1.0;
        Double expectedKilogram = 0.45359237;
        Double expectedGram = 453.59237;
        Double expectedMilligram = 453592.37;
        Double expectedOunce = 16.0;

        assertEquals(actualStone, expectedStone);
        assertEquals(actualPound, expectedPound);
        assertEquals(actualKilogram, expectedKilogram);
        assertEquals(actualGram, expectedGram);
        assertEquals(actualMilligram, expectedMilligram);
        assertEquals(actualOunce, expectedOunce);

    }

    @Test
    public void convertKilogramTest() {
        WeightController wc = new WeightController();
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertKilogram(1.0);

        Double actualStone = weightObj.getBody().getStone();
        Double actualPound = weightObj.getBody().getPound();
        Double actualKilogram = weightObj.getBody().getKilogram();
        Double actualGram = weightObj.getBody().getGram();
        Double actualMilligram = weightObj.getBody().getMilligram();
        Double actualOunce = weightObj.getBody().getOunce();

        Double expectedStone = 0.15747304442;
        Double expectedPound = 2.20462262;
        Double expectedKilogram = 1.0;
        Double expectedGram = 1000.0;
        Double expectedMilligram = 1000000.0;
        Double expectedOunce = 35.2739619;

        assertEquals(actualStone, expectedStone);
        assertEquals(actualPound, expectedPound);
        assertEquals(actualKilogram, expectedKilogram);
        assertEquals(actualGram, expectedGram);
        assertEquals(actualMilligram, expectedMilligram);
        assertEquals(actualOunce, expectedOunce);

    }

    @Test
    public void convertGramTest() {
        WeightController wc = new WeightController();
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertGram(1.0);

        Double actualStone = weightObj.getBody().getStone();
        Double actualPound = weightObj.getBody().getPound();
        Double actualKilogram = weightObj.getBody().getKilogram();
        Double actualGram = weightObj.getBody().getGram();
        Double actualMilligram = weightObj.getBody().getMilligram();
        Double actualOunce = weightObj.getBody().getOunce();

        Double expectedStone = 0.00015747304;
        Double expectedPound = 0.00220462262;
        Double expectedKilogram = 0.001;
        Double expectedGram = 1.0;
        Double expectedMilligram = 1000.0;
        Double expectedOunce = 0.03527396195;

        assertEquals(actualStone, expectedStone);
        assertEquals(actualPound, expectedPound);
        assertEquals(actualKilogram, expectedKilogram);
        assertEquals(actualGram, expectedGram);
        assertEquals(actualMilligram, expectedMilligram);
        assertEquals(actualOunce, expectedOunce);

    }

    @Test
    public void convertMilligramTest() {
        WeightController wc = new WeightController();
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertMilligram(1.0);

        Double actualStone = weightObj.getBody().getStone();
        Double actualPound = weightObj.getBody().getPound();
        Double actualKilogram = weightObj.getBody().getKilogram();
        Double actualGram = weightObj.getBody().getGram();
        Double actualMilligram = weightObj.getBody().getMilligram();
        Double actualOunce = weightObj.getBody().getOunce();

        Double expectedStone = 1.5747304e-7;
        Double expectedPound = 2.2046226e-6;
        Double expectedKilogram = 1e-6;
        Double expectedGram = 0.001;
        Double expectedMilligram = 1.0;
        Double expectedOunce = 3.5273962e-5;

        assertEquals(actualStone, expectedStone);
        assertEquals(actualPound, expectedPound);
        assertEquals(actualKilogram, expectedKilogram);
        assertEquals(actualGram, expectedGram);
        assertEquals(actualMilligram, expectedMilligram);
        assertEquals(actualOunce, expectedOunce);

    }

    @Test
    public void convertOunceTest() {
        WeightController wc = new WeightController();
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertOunce(1.0);

        Double actualStone = weightObj.getBody().getStone();
        Double actualPound = weightObj.getBody().getPound();
        Double actualKilogram = weightObj.getBody().getKilogram();
        Double actualGram = weightObj.getBody().getGram();
        Double actualMilligram = weightObj.getBody().getMilligram();
        Double actualOunce = weightObj.getBody().getOunce();

        Double expectedStone = 0.00446428571;
        Double expectedPound = 0.0625;
        Double expectedKilogram = 0.02834952313;
        Double expectedGram = 28.3495231;
        Double expectedMilligram = 28349.5231;
        Double expectedOunce = 1.0;

        assertEquals(actualStone, expectedStone);
        assertEquals(actualPound, expectedPound);
        assertEquals(actualKilogram, expectedKilogram);
        assertEquals(actualGram, expectedGram);
        assertEquals(actualMilligram, expectedMilligram);
        assertEquals(actualOunce, expectedOunce);

    }
}