package com.basu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.basu.service.EmployeeService;

@SpringBootApplication
public class EmployeeApplication {

	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}