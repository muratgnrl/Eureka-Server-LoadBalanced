package com.example.nameservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/name")
public class NameController {

    @Value("${NAME}")
    private String name;

    private int generateNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }
    @GetMapping("/getName")
    public ResponseEntity<String> getName(){
        return new ResponseEntity<>(name+"-"+generateNumber(), HttpStatus.OK);
    }
}