

package com.controller;

import com.model.Temperature;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * The type Temperature controller. This class accepts a temperature measurement in any of 3 different units, and
 * converts that measurement to the other 2 units and returns it to the user.
 */
@Controller
@SpringBootApplication
public class TemperatureController {

    /**
     * The enum Units. For temperature measurement conversion.
     */
    public enum units {
        fahrenheit, celsius, kelvin
    }

    static final Double defaultAmount = 1.0;

    /**
     * Temperature response entity. Shows that the user has chosen 'temperature' as their type of conversion.
     *
     * @return the response entity
     */
    @GetMapping(value = "/api/temperature")
    public ResponseEntity<?> temperature() {
        return new ResponseEntity<>(units.values(), HttpStatus.OK);
    }

    /**
     * Default temperature response entity. This receives the users choice of unit to convert.
     *
     * @param unit the unit
     * @return the response entity
     */
    @GetMapping(value = "/api/temperature/{unit}")
    public ResponseEntity<?> defaultTemperature(@PathVariable String unit) {
        return convertTemperature(unit, defaultAmount);
    }

    /**
     * Custom temperature response entity. This receives the unit and the numerical measurement they wish to convert.
     *
     * @param unit   the unit
     * @param amount the amount
     * @return the response entity
     */
    @GetMapping(value = "/api/temperature/{unit}/{amount}")
    public ResponseEntity<?> customTemperature(@PathVariable String unit,
                                               @PathVariable Double amount) {
        return convertTemperature(unit, amount);
    }

    /**
     * Convert temperature response entity. This switch statement determines which method to call based on what unit
     * the user would like to convert.
     *
     * @param unit   the unit
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertTemperature(String unit, Double amount) {
        switch (unit) {
            case "fahrenheit": return convertFahrenheit(amount);
            case "celsius": return convertCelsius(amount);
            case "kelvin": return convertKelvin(amount);
            default:return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting the resource.");
        }
    }

    /**
     * Json response response entity. This returns an error message if no value was entered, or the converted
     * measurements.
     *
     * @param temperatureModel the temperature model
     * @return the response entity
     */
    public ResponseEntity<?> jsonResponse(Temperature temperatureModel) {
        if (temperatureModel.getFahrenheit() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
        }
    }

    /**
     * Convert fahrenheit response entity. This method converts the value from fahrenheit to 2 other units of
     * temperature.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertFahrenheit(Double amount) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(amount);
        temperatureModel.setCelsius((amount-32)/1.8000);
        temperatureModel.setKelvin((amount-32)/1.8000+273.15);
        return jsonResponse(temperatureModel);
    }

    /**
     * Convert celsius response entity. This method converts the value from celsius to 2 other units of
     * temperature.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertCelsius(Double amount) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit(amount*1.8000+32);
        temperatureModel.setCelsius(amount);
        temperatureModel.setKelvin(amount+273.15);
        return jsonResponse(temperatureModel);
    }

    /**
     * Convert kelvin response entity. This method converts the value from kelvin to 2 other units of
     * temperature.
     *
     * @param amount the amount
     * @return the response entity
     */
    public ResponseEntity<?> convertKelvin(Double amount) {
        Temperature temperatureModel = new Temperature();
        temperatureModel.setFahrenheit((amount-273.15)*1.8000+32);
        temperatureModel.setCelsius(amount-273.15);
        temperatureModel.setKelvin(amount);
        return jsonResponse(temperatureModel);
    }
}