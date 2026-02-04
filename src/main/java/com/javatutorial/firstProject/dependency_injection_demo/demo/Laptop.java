package com.javatutorial.firstProject.dependency_injection_demo.demo;

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