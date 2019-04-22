package com.controller;

import com.model.Weight;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class WeightControllerTest {

    WeightController wc = new WeightController();

    Double actualStone;
    Double actualPound;
    Double actualKilogram;
    Double actualGram;
    Double actualMilligram;
    Double actualOunce;

    Double expectedStone;
    Double expectedPound;
    Double expectedKilogram;
    Double expectedGram;
    Double expectedMilligram;
    Double expectedOunce;

    @Test
    public void convertStoneTest() {
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertStone(1.0);

        actualStone = weightObj.getBody().getStone();
        actualPound = weightObj.getBody().getPound();
        actualKilogram = weightObj.getBody().getKilogram();
        actualGram = weightObj.getBody().getGram();
        actualMilligram = weightObj.getBody().getMilligram();
        actualOunce = weightObj.getBody().getOunce();

        expectedStone = 1.0;
        expectedPound = 14.0;
        expectedKilogram = 6.35029318;
        expectedGram = 6350.29318;
        expectedMilligram = 6350293.18;
        expectedOunce = 224.0;

        assertEquals(actualStone,expectedStone);
        assertEquals(actualPound,expectedPound);
        assertEquals(actualKilogram,expectedKilogram);
        assertEquals(actualGram,expectedGram);
        assertEquals(actualMilligram,expectedMilligram);
        assertEquals(actualOunce,expectedOunce);
    }

    @Test
    public void convertPoundTest() {
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertPound(1.0);

        actualStone = weightObj.getBody().getStone();
        actualPound = weightObj.getBody().getPound();
        actualKilogram = weightObj.getBody().getKilogram();
        actualGram = weightObj.getBody().getGram();
        actualMilligram = weightObj.getBody().getMilligram();
        actualOunce = weightObj.getBody().getOunce();

        expectedStone = 0.07142857143;
        expectedPound = 1.0;
        expectedKilogram = 0.45359237;
        expectedGram = 453.59237;
        expectedMilligram = 453592.37;
        expectedOunce = 16.0;

        assertEquals(actualStone,expectedStone);
        assertEquals(actualPound,expectedPound);
        assertEquals(actualKilogram,expectedKilogram);
        assertEquals(actualGram,expectedGram);
        assertEquals(actualMilligram,expectedMilligram);
        assertEquals(actualOunce,expectedOunce);
    }

    @Test
    public void convertKilogramTest() {
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertKilogram(1.0);

        actualStone = weightObj.getBody().getStone();
        actualPound = weightObj.getBody().getPound();
        actualKilogram = weightObj.getBody().getKilogram();
        actualGram = weightObj.getBody().getGram();
        actualMilligram = weightObj.getBody().getMilligram();
        actualOunce = weightObj.getBody().getOunce();

        expectedStone = 0.15747304442;
        expectedPound = 2.20462262;
        expectedKilogram = 1.0;
        expectedGram = 1000.0;
        expectedMilligram = 1000000.0;
        expectedOunce = 35.2739619;

        assertEquals(actualStone,expectedStone);
        assertEquals(actualPound,expectedPound);
        assertEquals(actualKilogram,expectedKilogram);
        assertEquals(actualGram,expectedGram);
        assertEquals(actualMilligram,expectedMilligram);
        assertEquals(actualOunce,expectedOunce);
    }

    @Test
    public void convertGramTest() {
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertGram(1.0);

        actualStone = weightObj.getBody().getStone();
        actualPound = weightObj.getBody().getPound();
        actualKilogram = weightObj.getBody().getKilogram();
        actualGram = weightObj.getBody().getGram();
        actualMilligram = weightObj.getBody().getMilligram();
        actualOunce = weightObj.getBody().getOunce();

        expectedStone = 0.00015747304;
        expectedPound = 0.00220462262;
        expectedKilogram = 0.001;
        expectedGram = 1.0;
        expectedMilligram = 1000.0;
        expectedOunce = 0.03527396195;

        assertEquals(actualStone,expectedStone);
        assertEquals(actualPound,expectedPound);
        assertEquals(actualKilogram,expectedKilogram);
        assertEquals(actualGram,expectedGram);
        assertEquals(actualMilligram,expectedMilligram);
        assertEquals(actualOunce,expectedOunce);
    }

    @Test
    public void convertMilligramTest() {
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertMilligram(1.0);

        actualStone = weightObj.getBody().getStone();
        actualPound = weightObj.getBody().getPound();
        actualKilogram = weightObj.getBody().getKilogram();
        actualGram = weightObj.getBody().getGram();
        actualMilligram = weightObj.getBody().getMilligram();
        actualOunce = weightObj.getBody().getOunce();

        expectedStone = 1.5747304e-7;
        expectedPound = 2.2046226e-6;
        expectedKilogram = 1e-6;
        expectedGram = 0.001;
        expectedMilligram = 1.0;
        expectedOunce = 3.5273962e-5;

        assertEquals(actualStone,expectedStone);
        assertEquals(actualPound,expectedPound);
        assertEquals(actualKilogram,expectedKilogram);
        assertEquals(actualGram,expectedGram);
        assertEquals(actualMilligram,expectedMilligram);
        assertEquals(actualOunce,expectedOunce);
    }

    @Test
    public void convertOunceTest() {
        ResponseEntity<Weight> weightObj = (ResponseEntity<Weight>) wc.convertOunce(1.0);

        actualStone = weightObj.getBody().getStone();
        actualPound = weightObj.getBody().getPound();
        actualKilogram = weightObj.getBody().getKilogram();
        actualGram = weightObj.getBody().getGram();
        actualMilligram = weightObj.getBody().getMilligram();
        actualOunce = weightObj.getBody().getOunce();

        expectedStone = 0.00446428571;
        expectedPound = 0.0625;
        expectedKilogram = 0.02834952313;
        expectedGram = 28.3495231;
        expectedMilligram = 28349.5231;
        expectedOunce = 1.0;

        assertEquals(actualStone,expectedStone);
        assertEquals(actualPound,expectedPound);
        assertEquals(actualKilogram,expectedKilogram);
        assertEquals(actualGram,expectedGram);
        assertEquals(actualMilligram,expectedMilligram);
        assertEquals(actualOunce,expectedOunce);
    }
}