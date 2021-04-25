package com.employee.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.mapper.DTOMapper;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private static List<EmployeeDTO> employeeList = new LinkedList<EmployeeDTO>();
	Long employeeCount = (long) employeeList.size();

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	DTOMapper dtoMapper;


	// Retrieve All employees
	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();
		for (Employee employee : employeeRepository.findAll()) {
			employeeDTOList.add(dtoMapper.convertToDto(employee));
		}
		return employeeDTOList;

	}

	// Retrieve a single employee
	public EmployeeDTO getEmployee(long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return dtoMapper.convertToDtoOptional(employee);
	}

	// Create a new employee
	public void createEmployee(EmployeeDTO employeeDto) {
		if (employeeDto.getId() == null) {
			employeeDto.setId(++employeeCount);
		}
		Employee employee = dtoMapper.convertToEntity(employeeDto);
		employee = employeeRepository.save(employee);
	}

	// Delete an employee
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
	}

	// Delete an employee
	public void deleteEmployee(EmployeeDTO employeeDto) {
		Employee employee = dtoMapper.convertToEntity(employeeDto);
		employeeRepository.delete(employee);
	}

	// Update an employee
	public boolean updateEmployee(EmployeeDTO employee) {
		boolean success = employeeList.add(employee);
		return success;
	}
}
