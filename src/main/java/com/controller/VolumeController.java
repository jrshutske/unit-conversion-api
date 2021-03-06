/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.controller;

import com.model.Volume;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * The type Volume controller. This class accepts a volume measurement in any of 7 different units, and converts
 * that measurement to the other 6 units and returns it to the user.
 */
@Controller
@SpringBootApplication
public class VolumeController {

    /**
     * The enum Units. For volume measurement conversion.
     */
    public enum units {
        gallon, liter, quart, pint, cup, milliliter, fluidOunce

    }

    static final Double defaultAmount = 1.0;

    /**
     * Volume response entity. Shows that the user has chosen 'volume' as their type of conversion.
     *
     * @return the response entity
     */
    @GetMapping(value = "/api/volume")
    public ResponseEntity<?> volume() {
        return new ResponseEntity<>(units.values(), HttpStatus.OK);
    }

    /**
     * Default volume response entity. This receives the users choice of unit to convert.
     *
     * @param unit the unit
     * @return the response entity
     */
    @GetMapping(value = "/api/volume/{unit}")
    public ResponseEntity<?> defaultVolume(@PathVariable String unit) {
        return convertVolume(unit, defaultAmount);
    }

    /**
     * Custom volume response entity. This receives the unit and the numerical measurement they wish to convert.
     *
     * @param unit   the unit
     * @param amount the amount
     * @return the response entity
     */
    @GetMapping(value = "/api/volume/{unit}/{amount}")
    public ResponseEntity<?> customVolume(@PathVariable String unit,
                                          @PathVariable Double amount) {
        return convertVolume(unit, amount);
    }

    /**
     * Convert volume response entity. This switch statement determines which method to call based on what unit
     * the user would like to convert.
     *
     * @param unit   the unit
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertVolume(String unit, Double amount) {
        switch (unit) {
            case "gallon":return convertGallon(amount);
            case "liter":return convertLiter(amount);
            case "quart":return convertQuart(amount);
            case "pint":return convertPint(amount);
            case "cup":return convertCup(amount);
            case "milliliter":return convertMilliliter(amount);
            case "fluidOunce":return convertFluidOunce(amount);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting the resource.");
        }
    }

    /**
     * Json response response entity. This returns an error message if no value was entered, or the converted
     * measurements.
     *
     * @param volumeModel the volume model
     * @return the response entity
     */
    public ResponseEntity<?> jsonResponse(Volume volumeModel) {
        if (volumeModel.getGallon() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(volumeModel, HttpStatus.OK);
        }
    }

    /**
     * Convert gallon response entity. This method converts the value from gallons to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertGallon(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount);
        volumeModel.setLiter(amount*3.78541178);
        volumeModel.setQuart(amount*4);
        volumeModel.setPint(amount*7.99999954);
        volumeModel.setCup(amount*16.004715);
        volumeModel.setMilliliter(amount*3785.41178);
        volumeModel.setFluidOunce(amount*128.000128);
        return jsonResponse(volumeModel);
    }

    /**
     * Convert liter response entity. This method converts the value from liters to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertLiter(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount*0.26417205236);
        volumeModel.setLiter(amount);
        volumeModel.setQuart(amount*1.05668821);
        volumeModel.setPint(amount*2.1133763);
        volumeModel.setCup(amount*4.2279984);
        volumeModel.setMilliliter(amount*1000);
        volumeModel.setFluidOunce(amount*33.8140565);
        return jsonResponse(volumeModel);
    }

    /**
     * Convert quart response entity. This method converts the value from quarts to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertQuart(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount*0.25);
        volumeModel.setLiter(amount*0.946352946);
        volumeModel.setQuart(amount);
        volumeModel.setPint(amount*1.99999989);
        volumeModel.setCup(amount*4.00117874);
        volumeModel.setMilliliter(amount*946.352946);
        volumeModel.setFluidOunce(amount*32.000032);
        return jsonResponse(volumeModel);
    }

    /**
     * Convert pint response entity. This method converts the value from pints to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertPint(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount*0.12500000713);
        volumeModel.setLiter(amount*0.4731765);
        volumeModel.setQuart(amount*0.50000002853);
        volumeModel.setPint(amount);
        volumeModel.setCup(amount*2.00058948);
        volumeModel.setMilliliter(amount*473.1765);
        volumeModel.setFluidOunce(amount*16.0000169);
        return jsonResponse(volumeModel);
    }

    /**
     * Convert cup response entity. This method converts the value from cups to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertCup(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount*0.0624815876);
        volumeModel.setLiter(amount*0.236518538);
        volumeModel.setQuart(amount*0.24992635042);
        volumeModel.setPint(amount*0.49985267231);
        volumeModel.setCup(amount);
        volumeModel.setMilliliter(amount*236.518538);
        volumeModel.setFluidOunce(amount*7.99765121);
        return jsonResponse(volumeModel);
    }

    /**
     * Convert milliliter response entity. This method converts the value from milliliters to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertMilliliter(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount*0.00026417205);
        volumeModel.setLiter(amount*0.001);
        volumeModel.setQuart(amount*0.00105668821);
        volumeModel.setPint(amount*0.0021133763);
        volumeModel.setCup(amount*0.0042279984);
        volumeModel.setMilliliter(amount);
        volumeModel.setFluidOunce(amount*0.0338140565);
        return jsonResponse(volumeModel);
    }

    /**
     * Convert fluid ounce response entity. This method converts the value from fluid ounces to 6 other units of volume.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertFluidOunce(Double amount) {
        Volume volumeModel = new Volume();
        volumeModel.setGallon(amount*0.00781249219);
        volumeModel.setLiter(amount*0.0295735);
        volumeModel.setQuart(amount*0.03124996876);
        volumeModel.setPint(amount*0.06249993396);
        volumeModel.setCup(amount*0.12503671065);
        volumeModel.setMilliliter(amount*29.5735);
        volumeModel.setFluidOunce(amount);
        return jsonResponse(volumeModel);
    }
}