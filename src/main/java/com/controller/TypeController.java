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

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * The type Type controller.
 */
@Controller
@SpringBootApplication
public class TypeController {

    /**
     * The enum Types. For type determination.
     */
    public enum types {

        volume, length,
        weight, temperature

    }

    /**
     * Api response entity. Sends the rest of the information to the appropriate class.
     *
     * @return the response entity
     */
    @GetMapping(value = "/api")
    public ResponseEntity<?> api() {
        return new ResponseEntity<>(types.values(), HttpStatus.OK);
    }
}

