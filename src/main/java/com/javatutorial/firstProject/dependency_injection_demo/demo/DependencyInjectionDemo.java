package com.javatutorial.firstProject.dependency_injection_demo.demo;
import org.springframework.stereotype.Component;

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