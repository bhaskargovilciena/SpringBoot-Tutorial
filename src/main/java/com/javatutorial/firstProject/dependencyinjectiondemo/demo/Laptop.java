package com.javatutorial.firstProject.dependencyinjectiondemo.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class Laptop implements Computer {
    @Override
    public void doWork() {
        System.out.println("Laptop did some work");
    }
}