package com.example.stackoverflowerrorsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/sample")
public class StackoverflowErrorSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(StackoverflowErrorSampleApplication.class, args);
    }

    @PostMapping
    public String hello() {
        return "Hello world";
    }
}
