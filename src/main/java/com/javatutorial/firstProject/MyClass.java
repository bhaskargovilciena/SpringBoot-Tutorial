package com.javatutorial.firstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("abc") // this annotation tells that the function will be executed when the api endpoint is hit. the endpoint is mentioned in brackets in string
    public int sayHello() {
        return 123;
    }
}
