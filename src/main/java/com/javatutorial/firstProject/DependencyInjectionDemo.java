package com.javatutorial.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Computer {
    void doWork();
}

@Component
@Primary
class Laptop implements Computer {
    @Override
    public void doWork() {
        System.out.println("Laptop did some work");
    }
}

@Component
class Desktop implements Computer {
    @Override
    public void doWork() {
        System.out.println("desktop did some work");
    }
}

@Component
public class DependencyInjectionDemo {
    private Computer computer;

    public DependencyInjectionDemo(Computer computer) {
        this.computer = computer;
    }

    public void doSomething() {
        computer.doWork();
    }
}