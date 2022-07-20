package com.example.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.javainuse.controllers.TestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)

public class SpringboothelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothelloworldApplication.class, args);
	}

}
