package com.javatutorial.firstProject.dependencyinjectiondemo.demo;

import org.springframework.stereotype.Component;

@Component
class Desktop implements Computer {
    @Override
    public void doWork() {
        System.out.println("desktop did some work");
    }
}

