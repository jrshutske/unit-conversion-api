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

import com.model.Weight;
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
public class WeightController {

    public enum Units {
        stone, pound, kilogram,
        gram, milligram, ounce
    }

    @GetMapping(value = "/api/weight")
    public ResponseEntity<?> weight() {
        final List<Units> amountsArrayList = new ArrayList<>();
        for (Units amount : Units.values()) {
            amountsArrayList.add(amount);
        }
        if (amountsArrayList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(amountsArrayList, HttpStatus.OK);
        }
    }

    @GetMapping(value = "/api/weight/{unit}/{amount}")
    public ResponseEntity<?> weight(@PathVariable String unit,
                                    @PathVariable Double amount) {
        switch (unit) {
            case "stone":return convertStone(amount);
            case "pound":return convertPound(amount);
            case "kilogram":return convertKilogram(amount);
            case "gram":return convertGram(amount);
            case "milligram":return convertMilligram(amount);
            case "ounce":return convertOunce(amount);
            default:return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        }

    }

    public ResponseEntity<?> jsonResponse(Weight weightModel) {
        if (weightModel.getStone() == null) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(weightModel, HttpStatus.OK);
        }
    }

    public ResponseEntity<?> convertStone(Double amount) {
        Weight weightModel = new Weight();
        weightModel.setStone(amount);
        weightModel.setPound(amount*14);
        weightModel.setKilogram(amount*6.35029318);
        weightModel.setGram(amount*6350.29318);
        weightModel.setMilligram(amount*6350293.18);
        weightModel.setOunce(amount*224);
        return jsonResponse(weightModel);

    }

    public ResponseEntity<?> convertPound(Double amount) {
        Weight weightModel = new Weight();
        weightModel.setStone(amount*0.07142857143);
        weightModel.setPound(amount);
        weightModel.setKilogram(amount*0.45359237);
        weightModel.setGram(amount*453.59237);
        weightModel.setMilligram(amount*453592.37);
        weightModel.setOunce(amount*16);
        return jsonResponse(weightModel);
    }

    public ResponseEntity<?> convertKilogram(Double amount) {
        Weight weightModel = new Weight();
        weightModel.setStone(amount*0.15747304442);
        weightModel.setPound(amount*2.20462262);
        weightModel.setKilogram(amount);
        weightModel.setGram(amount*1000);
        weightModel.setMilligram(amount*1000000);
        weightModel.setOunce(amount*35.2739619);
        return jsonResponse(weightModel);
    }

    public ResponseEntity<?> convertGram(Double amount) {
        Weight weightModel = new Weight();
        weightModel.setStone(amount*0.00015747304);
        weightModel.setPound(amount*0.00220462262);
        weightModel.setKilogram(amount*0.001);
        weightModel.setGram(amount);
        weightModel.setMilligram(amount*1000);
        weightModel.setOunce(amount*0.03527396195);
        return jsonResponse(weightModel);
    }

    public ResponseEntity<?> convertMilligram(Double amount) {
        Weight weightModel = new Weight();
        weightModel.setStone(amount*1.5747304e-7);
        weightModel.setPound(amount*2.2046226e-6);
        weightModel.setKilogram(amount*1e-6);
        weightModel.setGram(amount*0.001);
        weightModel.setMilligram(amount);
        weightModel.setOunce(amount*3.5273962e-5);
        return jsonResponse(weightModel);
    }

    public ResponseEntity<?> convertOunce(Double amount) {
        Weight weightModel = new Weight();
        weightModel.setStone(amount*0.00446428571);
        weightModel.setPound(amount*0.0625);
        weightModel.setKilogram(amount*0.02834952313);
        weightModel.setGram(amount*28.3495231);
        weightModel.setMilligram(amount*28349.5231);
        weightModel.setOunce(amount);
        return jsonResponse(weightModel);
    }

}