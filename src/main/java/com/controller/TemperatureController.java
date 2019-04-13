

package com.controller;

import com.model.Temperature;
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
public class TemperatureController {

    public enum Units {
        fahrenheit, celsius, kelvin
    }

    @GetMapping(value = "/api/temperature")
    public ResponseEntity<?> temperature() {
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

    @GetMapping(value = "/api/temperature/{unit}")
    public ResponseEntity<?> volume(@PathVariable String unit) {
        switch (unit) {
            case "fahrenheit": return convertFahrenheit(1);
            case "celsius": return convertCelsius(1);
            case "kelvin": return convertKelvin(1);
            default:
                return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        }

    }

    public ResponseEntity<?> convertFahrenheit(int unit) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(unit);
        temperatureModel.setCelsius(unit);
        temperatureModel.setKelvin(unit);
        if (temperatureModel.getFahrenheit() != 1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
        }
    }
    public ResponseEntity<?> convertCelsius(int unit) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(unit);
        temperatureModel.setCelsius(unit);
        temperatureModel.setKelvin(unit);
        if (temperatureModel.getCelsius() != 1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
        }
    }
    public ResponseEntity<?> convertKelvin(int unit) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(unit);
        temperatureModel.setCelsius(unit);
        temperatureModel.setKelvin(unit);
        if (temperatureModel.getKelvin() != 1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
        }
    }
}