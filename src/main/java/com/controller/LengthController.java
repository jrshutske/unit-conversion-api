package com.controller;

import com.model.Length;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * The type Length controller. This class accepts a length measurement in any of 8 different units, and converts
 * that measurement to the other 7 units and returns it to the user.
 */
@Controller
@SpringBootApplication
public class LengthController {

    /**
     * The enum Units. For length measurement conversion.
     */
    public enum units {
        mile, kilometer, yard,
        meter, centimeter, foot,
        inch, millimeter
    }

    static final Double defaultAmount = 1.0;

    /**
     * Length response entity. Shows that the user has chosen 'length' as their type of conversion.
     *
     * @return the response entity
     */
    @GetMapping(value = "/api/length")
    public ResponseEntity<?> length() {
        return new ResponseEntity<>(units.values(), HttpStatus.OK);
    }

    /**
     * Default length response entity. This receives the users choice of unit to convert.
     *
     * @param unit the unit
     * @return the response entity
     */
    @GetMapping(value = "/api/length/{unit}")
    public ResponseEntity<?> defaultLength(@PathVariable String unit) {
        return convertLength(unit, defaultAmount);
    }

    /**
     * Custom length response entity. This receives the unit and the numerical measurement they wish to convert.
     *
     * @param unit   the unit
     * @param amount the amount
     * @return the response entity
     */
    @GetMapping(value = "/api/length/{unit}/{amount}")
    public ResponseEntity<?> customLength(@PathVariable String unit,
                                          @PathVariable Double amount) {
        return convertLength(unit, amount);
    }

    /**
     * Convert length response entity. This switch statement determines which method to call based on what unit
     * the user would like to convert.
     *
     * @param unit   the unit
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertLength(String unit, Double amount) {
        switch(unit) {
            case "mile":return convertMile(amount);
            case "kilometer":return convertKilometer(amount);
            case "yard":return convertYard(amount);
            case "inch":return convertInch(amount);
            case "meter":return convertMeter(amount);
            case "centimeter":return convertCentimeter(amount);
            case "millimeter":return convertMillimeter(amount);
            case "foot":return convertFoot(amount);
            default:return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        }
    }

    /**
     * Json response response entity. This returns an error message if no value was entered.
     *
     * @param lengthModel the length model
     * @return the response entity
     */
    public ResponseEntity<?> jsonResponse(Length lengthModel) {
        if (lengthModel.getMile() == null) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    /**
     * Convert mile response entity. This method converts the value from miles to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertMile(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*160934.4);
        lengthModel.setFoot(amount*5280);
        lengthModel.setInch(amount*63360);
        lengthModel.setKilometer(amount*1.609);
        lengthModel.setMeter(amount*1609.344);
        lengthModel.setMile(amount);
        lengthModel.setMillimeter(amount*1.609e+6);
        lengthModel.setYard(amount*1760);
        return jsonResponse(lengthModel);
    }


    /**
     * Convert kilometer response entity. This method converts the value from kilometers to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertKilometer(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*100000);
        lengthModel.setFoot(amount*3280.84);
        lengthModel.setInch(amount*39370.079);
        lengthModel.setKilometer(amount);
        lengthModel.setMeter(amount*1000);
        lengthModel.setMile(amount*0.62137119224);
        lengthModel.setMillimeter(amount*1000000);
        lengthModel.setYard(amount*1093.613);
        return jsonResponse(lengthModel);
    }

    /**
     * Convert yard response entity. This method converts the value from yards to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertYard(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*91.44);
        lengthModel.setFoot(amount*3);
        lengthModel.setInch(amount*36);
        lengthModel.setKilometer(amount*0.0009144);
        lengthModel.setMeter(amount*0.9144);
        lengthModel.setMile(amount*0.00056818182);
        lengthModel.setMillimeter(amount*914.4);
        lengthModel.setYard(amount);
        return jsonResponse(lengthModel);
    }

    /**
     * Convert meter response entity. This method converts the value from meters to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertMeter(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*100);
        lengthModel.setFoot(amount*3.281);
        lengthModel.setInch(amount*39.37);
        lengthModel.setKilometer(amount*0.001);
        lengthModel.setMeter(amount);
        lengthModel.setMile(amount*0.00062137119);
        lengthModel.setMillimeter(amount*1000);
        lengthModel.setYard(amount*1.094);
        return jsonResponse(lengthModel);
    }

    /**
     * Convert foot response entity. This method converts the value from feet to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertFoot(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*30.48);
        lengthModel.setFoot(amount);
        lengthModel.setInch(amount*12);
        lengthModel.setKilometer(amount*0.0003048);
        lengthModel.setMeter(amount*0.3048);
        lengthModel.setMile(amount*0.00018939394);
        lengthModel.setMillimeter(amount*304.8);
        lengthModel.setYard(amount*0.333333);
        return jsonResponse(lengthModel);
    }

    /**
     * Convert inch response entity. This method converts the value from inches to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertInch(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*2.54);
        lengthModel.setFoot(amount*0.0833333);
        lengthModel.setInch(amount);
        lengthModel.setKilometer(amount*2.54e-5);
        lengthModel.setMeter(amount*0.0254);
        lengthModel.setMile(amount*1.5782828e-5);
        lengthModel.setMillimeter(amount*25.4);
        lengthModel.setYard(amount*0.02777777778);
        return jsonResponse(lengthModel);
    }

    /**
     * Convert centimeter response entity. This method converts the value from centimeters to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertCentimeter(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount);
        lengthModel.setFoot(amount*0.03280839895);
        lengthModel.setInch(amount*0.3937007874);
        lengthModel.setKilometer(amount*1.0e-5);
        lengthModel.setMeter(amount*0.01);
        lengthModel.setMile(amount*6.2137119e-6);
        lengthModel.setMillimeter(amount*10);
        lengthModel.setYard(amount*0.01093613298);
        return jsonResponse(lengthModel);
    }

    /**
     * Convert millimeter response entity. This method converts the value from millimeters to 7 other units of length.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertMillimeter(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*0.1);
        lengthModel.setFoot(amount*0.0032808399);
        lengthModel.setInch(amount*0.03937007874);
        lengthModel.setKilometer(amount*1e-6);
        lengthModel.setMeter(amount*0.001);
        lengthModel.setMile(amount*6.2137119e-7);
        lengthModel.setMillimeter(amount);
        lengthModel.setYard(amount*0.0010936133);
        return jsonResponse(lengthModel);
    }
}

