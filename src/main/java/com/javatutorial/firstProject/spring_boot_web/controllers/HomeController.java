package com.javatutorial.firstProject.spring_boot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // demo of working via API
    @GetMapping("") // this annotation tells that the function will be executed when the
    // api endpoint is hit. the endpoint is mentioned in brackets in string
    public String sayHello() {
        return "Hello World! Bhaskar this side!!";
    }

    @RequestMapping("/about")
    public String sayAbout() {
        return "I am an intern at Ciena!";
    }
}
