package com.basu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basu.dto.EmployeeDto;
import com.basu.service.EmployeeService;

@RestController
@RequestMapping("/EmployeeService")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}
	
	@GetMapping("/getEmployee")
	public List<EmployeeDto> getEmployee()
	{
		
		return employeeService.getEmployee();
	}
	
	/*
	 * @PostMapping("/addEmployee") public String addEmployee() {
	 * 
	 * }
	 */
	

}
