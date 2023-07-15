package com.github.alecmus.springboot3webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This is the application's entry point. When the application is run Spring will scan for
 * all components and instantiate them automatically so that they can be injected wherever
 * they will be needed. We don't have to explicitly instantiate components using 'new'. Spring
 * manages all of that for us.
 */
@SpringBootApplication
public class Springboot3WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3WebappApplication.class, args);
	}

}
