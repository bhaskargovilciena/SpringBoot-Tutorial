package com.javatutorial.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
		// injecting the object without creating the object. we get the object from the IOC container which is of the type ApplicationContext

		MyClass myClass;
		myClass.sayHello();
	}

}
