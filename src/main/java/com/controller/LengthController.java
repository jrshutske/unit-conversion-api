package com.controller;

import com.model.Length;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@SpringBootApplication
public class LengthController {

    public enum units {
        mile, kilometer, yard,
        meter, centimeter, foot,
        inch, millimeter
    }

    static final Double defaultAmount = 1.0;

    @GetMapping(value = "/api/length")
    public ResponseEntity<?> length() {
        return new ResponseEntity<>(units.values(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/length/{unit}")
    public ResponseEntity<?> defaultLength(@PathVariable String unit) {
        return convertLength(unit, defaultAmount);
    }

    @GetMapping(value = "/api/length/{unit}/{amount}")
    public ResponseEntity<?> customLength(@PathVariable String unit,
                                          @PathVariable Double amount) {
        return convertLength(unit, amount);
    }

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

    public ResponseEntity<?> jsonResponse(Length lengthModel) {
        if (lengthModel.getMile() == null) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

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


    public ResponseEntity<?> convertKilometer(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*100000);
        lengthModel.setFoot(amount*3280.84);
        lengthModel.setInch(amount*39370.079);
        lengthModel.setKilometer(amount);
        lengthModel.setMeter(amount*1000);
        lengthModel.setMile(amount/1.609);
        lengthModel.setMillimeter(amount/1e+6);
        lengthModel.setYard(amount*1093.613);
        return jsonResponse(lengthModel);
    }

    public ResponseEntity<?> convertYard(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount* 91.44);
        lengthModel.setFoot(amount*3);
        lengthModel.setInch(amount*36);
        lengthModel.setKilometer(amount/1093.613);
        lengthModel.setMeter(amount/1.094);
        lengthModel.setMile(amount/1760);
        lengthModel.setMillimeter(amount*914.4);
        lengthModel.setYard(amount);
        return jsonResponse(lengthModel);
    }

    public ResponseEntity<?> convertMeter(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*100);
        lengthModel.setFoot(amount*3.281);
        lengthModel.setInch(amount*39.37);
        lengthModel.setKilometer(amount/1000);
        lengthModel.setMeter(amount);
        lengthModel.setMile(amount/1609.344);
        lengthModel.setMillimeter(amount*1000);
        lengthModel.setYard(amount*1.094);
        return jsonResponse(lengthModel);
    }

    public ResponseEntity<?> convertFoot(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*30.48);
        lengthModel.setFoot(amount);
        lengthModel.setInch(amount*12);
        lengthModel.setKilometer(amount/3280.84);
        lengthModel.setMeter(amount/3.281);
        lengthModel.setMile(amount/5280);
        lengthModel.setMillimeter(amount*304.8);
        lengthModel.setYard(amount/3);
        return jsonResponse(lengthModel);
    }

    public ResponseEntity<?> convertInch(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount*2.54);
        lengthModel.setFoot(amount/12);
        lengthModel.setInch(amount);
        lengthModel.setKilometer(amount/39370.079);
        lengthModel.setMeter(amount/39.37);
        lengthModel.setMile(amount/63360);
        lengthModel.setMillimeter(amount*25.4);
        lengthModel.setYard(amount/36);
        return jsonResponse(lengthModel);
    }

    public ResponseEntity<?> convertCentimeter(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount);
        lengthModel.setFoot(amount/30.48);
        lengthModel.setInch(amount/2.54);
        lengthModel.setKilometer(amount/100000);
        lengthModel.setMeter(amount/100);
        lengthModel.setMile(amount/160934.4);
        lengthModel.setMillimeter(amount*10);
        lengthModel.setYard(amount/91.44);
        return jsonResponse(lengthModel);
    }

    public ResponseEntity<?> convertMillimeter(Double amount) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(amount/10);
        lengthModel.setFoot(amount/304.8);
        lengthModel.setInch(amount/25.4);
        lengthModel.setKilometer(amount/1e+6);
        lengthModel.setMeter(amount/1000);
        lengthModel.setMile(amount/1.609e+6);
        lengthModel.setMillimeter(amount);
        lengthModel.setYard(amount/914.4);
        return jsonResponse(lengthModel);
    }
}

