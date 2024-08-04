package com.example.GitHub.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api")
public class EndPoint {
    @GetMapping(path = "/getData")
    public ResponseEntity<String> getMethod(){

        return new ResponseEntity<>("This is a demo Api",HttpStatus.OK);

    }
}
