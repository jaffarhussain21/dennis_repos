package com.employee.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.employee.*")
public class EmployeeDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDataApplication.class, args);
	}

}
