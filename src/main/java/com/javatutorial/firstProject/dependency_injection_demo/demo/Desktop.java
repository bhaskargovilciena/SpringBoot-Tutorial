package com.javatutorial.firstProject.dependency_injection_demo.demo;

import org.springframework.stereotype.Component;

@Component
class Desktop implements Computer {
    @Override
    public void doWork() {
        System.out.println("desktop did some work");
    }
}

