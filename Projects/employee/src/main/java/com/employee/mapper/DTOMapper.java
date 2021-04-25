package com.employee.mapper;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;

@Component
public class DTOMapper {
	
	private ModelMapper modelMapper = new ModelMapper();

	public EmployeeDTO convertToDto(Employee employee) {
		EmployeeDTO employeeDto = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDto;
	}

	public EmployeeDTO convertToDtoOptional(Optional<Employee> employee) {
		EmployeeDTO employeeDto = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDto;
	}

	public Employee convertToEntity(EmployeeDTO employeeDto) {
		Employee employee = modelMapper.map(employeeDto, Employee.class);
		return employee;
	}
}
