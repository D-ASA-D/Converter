package com.beta.converter.controller;

import com.beta.converter.dto.Lengths;
import com.beta.converter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//curl -X POST -d {\"number\":\"10\",\"inUnits\":\"KM\",\"outUnits\":\"MM\"} -H "Content-Type: application/json" http://localhost:8080/convert/test

@RestController
@CrossOrigin("*")
@RequestMapping("/convert")
public class ConverterController {
    private final ConverterService service;

    @Autowired
    public ConverterController(ConverterService s){
        service = s;
    }

    @PostMapping("/length")
    private double testPost(@RequestBody Lengths inputValues){
        System.out.println(inputValues);
        return service.convert(inputValues.getInUnits(), inputValues.getOutUnits(), inputValues.getNumber());
    }

    @GetMapping("/test")
    private String testGet(){
        return "Тестовый GET работает!";
    }

}
