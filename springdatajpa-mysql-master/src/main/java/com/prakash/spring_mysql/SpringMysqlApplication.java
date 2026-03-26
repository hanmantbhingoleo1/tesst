package com.prakash.spring_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringMysqlApplication - Entry point for the Spring Boot application.
 *
 * This class initializes and starts the Spring Boot application using the embedded Tomcat server.
 *
 * @author Prakash Karuppusamy
 */
@SpringBootApplication // Marks this class as the main Spring Boot application.
public class SpringMysqlApplication {

	/**
	 * Main method - The entry point of the Spring Boot application.
	 *
	 * @param args Command-line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlApplication.class, args);
	}
}