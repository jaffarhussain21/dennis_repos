package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDTO;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/getEmployees")
	public List<EmployeeDTO> getAllEmployees() {
		return employeeService.getAllEmployees();

	}

	@GetMapping(path = "/getEmployee/{id}")
	public EmployeeDTO getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}

	@PostMapping(path = "/createEmployee")
	public void createEmployee(@RequestBody EmployeeDTO employee) {
		employeeService.createEmployee(employee);
	}

	// @PutMapping

	@DeleteMapping(path = "/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}

}
