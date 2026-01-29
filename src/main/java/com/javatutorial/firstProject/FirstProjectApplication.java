package com.javatutorial.firstProject;

import com.javatutorial.firstProject.dependencyinjection.DependencyInjectionDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		// SpringApplication.run returns a ApplicationContext which can be used
		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		// creating a bean using the ApplicationContext
		DependencyInjectionDemo DIdemo = context.getBean(DependencyInjectionDemo.class);
		DIdemo.doSomething();
	}

}
