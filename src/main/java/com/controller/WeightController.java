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

import com.controller.TypeController;
import com.model.Weight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.InvocationHandler;
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

    @GetMapping(value = "/api/weight/{unit}")
    public ResponseEntity<?> weight(@PathVariable String unit) {
        switch (unit) {
            case "stone":
                return convertStone(1);
            default:
                return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        }

    }

    public ResponseEntity<?> convertStone(int unit) {
        Weight weightModel = new Weight();
        weightModel.setStone(unit);
        weightModel.setPound(unit);
        weightModel.setKilogram(unit);
        weightModel.setGram(unit);
        weightModel.setMilligram(unit);
        weightModel.setOunce(unit);
        if (weightModel.getStone() != 1) {
            return ResponseEntity.status(HttpStatus.OK).body("There was a problem getting the resource.");
        } else {
            return new ResponseEntity<>(weightModel, HttpStatus.OK);
        }
    }
}