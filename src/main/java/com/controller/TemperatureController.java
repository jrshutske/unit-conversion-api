

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

    public enum units {
        fahrenheit, celsius, kelvin
    }

    static final Double defaultAmount = 1.0;

    @GetMapping(value = "/api/temperature")
    public ResponseEntity<?> temperature() {
        return new ResponseEntity<>(units.values(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/temperature/{unit}")
    public ResponseEntity<?> defaultTemperature(@PathVariable String unit) {
        return convertTemperature(unit, defaultAmount);
    }

    @GetMapping(value = "/api/temperature/{unit}/{amount}")
    public ResponseEntity<?> customTemperature(@PathVariable String unit,
                                               @PathVariable Double amount) {
        return convertTemperature(unit, amount);
    }

    public ResponseEntity<?> convertTemperature(String unit, Double amount) {
        switch (unit) {
            case "fahrenheit": return convertFahrenheit(amount);
            case "celsius": return convertCelsius(amount);
            case "kelvin": return convertKelvin(amount);
            default:return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        }
    }

    public ResponseEntity<?> jsonResponse(Temperature temperatureModel) {
        if (temperatureModel.getFahrenheit() == null) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertFahrenheit(Double amount) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(amount);
        temperatureModel.setCelsius((amount-32)/1.8000);
        temperatureModel.setKelvin((amount-32)/1.8000+273.15);
        return jsonResponse(temperatureModel);
    }

    public ResponseEntity<?> convertCelsius(Double amount) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(amount*1.8000+32);
        temperatureModel.setCelsius(amount);
        temperatureModel.setKelvin(amount+273.15);
        return jsonResponse(temperatureModel);
    }

    public ResponseEntity<?> convertKelvin(Double amount) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit((amount-273.15)*1.8000+32);
        temperatureModel.setCelsius(amount-273.15);
        temperatureModel.setKelvin(amount);
        return jsonResponse(temperatureModel);
    }
}