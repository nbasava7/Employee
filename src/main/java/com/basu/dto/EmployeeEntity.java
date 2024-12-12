package com.basu.dto;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class EmployeeEntity {
	@Id
	private int id;
	private String name;
	private BigDecimal salary;
	private String address;
}
