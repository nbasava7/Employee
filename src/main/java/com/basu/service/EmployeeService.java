package com.basu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.basu.adapter.EmployeeAdapter;
import com.basu.dto.EmployeeDto;
import com.basu.dto.EmployeeEntity;
import com.basu.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;
	private EmployeeAdapter adapter;
	
	EmployeeService(EmployeeRepository employeeRepository,EmployeeAdapter adapter)
	{
      this.employeeRepository = employeeRepository;
      this.adapter = adapter;
	}
	
	public List<EmployeeDto> getEmployee() {
		List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
		return adapter.getEmployeeDtos(employeeEntities);
	}
}
