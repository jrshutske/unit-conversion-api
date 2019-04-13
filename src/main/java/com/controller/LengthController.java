package com.controller;

import com.model.Length;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;


@Controller
@SpringBootApplication
public class LengthController {

    public enum Units {
        mile, kilometer, yard,
        meter, centimeter, foot,
        inch, millimeter
    }

    @GetMapping(value = "/api/length")
    public ResponseEntity<?> length() {
        final List<Units> unitsArrayList = new ArrayList<>();
        for (Units unit : Units.values()) {
            unitsArrayList.add(unit);
        }
        if (unitsArrayList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(unitsArrayList, HttpStatus.OK);
        }
    }

    @GetMapping(value = "/api/length/{unit}/{amount}")
    public ResponseEntity<?> length(@PathVariable String unit,
                                    @PathVariable Double amount) {
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
        if (lengthModel.getMile() == null) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
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
        if (lengthModel.getKilometer()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertYard(Double unit) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(unit);
        lengthModel.setFoot(unit);
        lengthModel.setInch(unit);
        lengthModel.setKilometer(unit);
        lengthModel.setMeter(unit);
        lengthModel.setMile(unit);
        lengthModel.setMillimeter(unit);
        lengthModel.setYard(unit);
        if (lengthModel.getYard()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertMeter(double unit) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(unit);
        lengthModel.setFoot(unit);
        lengthModel.setInch(unit);
        lengthModel.setKilometer(unit);
        lengthModel.setMeter(unit);
        lengthModel.setMile(unit);
        lengthModel.setMillimeter(unit);
        lengthModel.setYard(unit);
        if (lengthModel.getMeter()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertFoot(double unit) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(unit);
        lengthModel.setFoot(unit);
        lengthModel.setInch(unit);
        lengthModel.setKilometer(unit);
        lengthModel.setMeter(unit);
        lengthModel.setMile(unit);
        lengthModel.setMillimeter(unit);
        lengthModel.setYard(unit);
        if (lengthModel.getFoot()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertInch(double unit) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(unit);
        lengthModel.setFoot(unit);
        lengthModel.setInch(unit);
        lengthModel.setKilometer(unit);
        lengthModel.setMeter(unit);
        lengthModel.setMile(unit);
        lengthModel.setMillimeter(unit);
        lengthModel.setYard(unit);
        if (lengthModel.getInch()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertCentimeter(double unit) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(unit);
        lengthModel.setFoot(unit);
        lengthModel.setInch(unit);
        lengthModel.setKilometer(unit);
        lengthModel.setMeter(unit);
        lengthModel.setMile(unit);
        lengthModel.setMillimeter(unit);
        lengthModel.setYard(unit);
        if (lengthModel.getCentimeter()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertMillimeter(double unit) {
        Length lengthModel = new Length();
        lengthModel.setCentimeter(unit);
        lengthModel.setFoot(unit);
        lengthModel.setInch(unit);
        lengthModel.setKilometer(unit);
        lengthModel.setMeter(unit);
        lengthModel.setMile(unit);
        lengthModel.setMillimeter(unit);
        lengthModel.setYard(unit);
        if (lengthModel.getMillimeter()!=1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(lengthModel, HttpStatus.OK);
        }
    }
}

