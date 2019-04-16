package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


  @GetMapping(path="/")
  public ResponseEntity<String> getHelloWorld() {
    return ResponseEntity.ok("Hello world");
  }
}
