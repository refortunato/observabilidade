package com.renan.observabilidade.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
@CrossOrigin(origins = "*", maxAge = 3600)
public class MyFirstController {

    @GetMapping
    public ResponseEntity<Object> getTest() {
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
