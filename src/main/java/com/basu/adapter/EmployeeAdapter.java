package com.basu.adapter;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.basu.dto.EmployeeDto;
import com.basu.dto.EmployeeEntity;

@Component
public class EmployeeAdapter {

	ModelMapper mapper;
	
	@Autowired
	EmployeeAdapter(ModelMapper mapper)
	{
		this.mapper = mapper;
	}

	public List<EmployeeDto> getEmployeeDtos(List<EmployeeEntity> employeeEntities) {

		return employeeEntities.stream().map(this::getEmployeeDto).toList();
	}

	public EmployeeDto getEmployeeDto(EmployeeEntity employeeEntity) {
		
		return mapper.map(employeeEntity, EmployeeDto.class);
	}
}
