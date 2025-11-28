package com.beta.converter.controller;

import com.beta.converter.dto.Lengths;
import org.springframework.web.bind.annotation.*;

//curl -X POST -d {\"number\":\"10\",\"inUnits\":\"KM\",\"outUnits\":\"MM\"} -H "Content-Type: application/json" http://localhost:8080/convert/test

@RestController
@CrossOrigin("*")
@RequestMapping("/convert")
public class ConverterController {

    @PostMapping("/length")
    private Lengths testPost(@RequestBody Lengths inputValues){
        System.out.println(inputValues);
        return inputValues;
    }

    @GetMapping("/test")
    private String testGet(){
        return "Тестовый GET работает!";
    }

}
