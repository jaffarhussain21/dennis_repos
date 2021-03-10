package com.employee.service;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private static List<EmployeeDTO> employeeList = new LinkedList<EmployeeDTO>();
	Long employeeCount = (long) employeeList.size();

	@Autowired
	EmployeeRepository employeeRepository;
	
	static {
		System.out.println("******Static block called******");
		employeeList.add(new EmployeeDTO(1l, "Jack", "HR", 10000, "HR-Specialist", new Date()));
		employeeList.add(new EmployeeDTO(2l, "Fred", "Admin", 20000, "Admin-Specialist", new Date()));
		employeeList.add(new EmployeeDTO(3l, "Dennis", "IT", 25000, "IT-Specialist", new Date()));

	}

	public EmployeeService() {
		super();
		System.out.println("******Constructor block called******");
	}

	// Retrieve All employees
	public List<Employee> getAllEmployees() {
		//return employeeRepository.findAll();
		return null;
	}

	// Retrieve a single employee
	public EmployeeDTO getEmployee(long id) {
		for (EmployeeDTO e : employeeList) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	// Create a new employee
	public boolean createEmployee(EmployeeDTO employee) {
		if (employee.getId() == null) {
			employee.setId(++employeeCount);
		}
		boolean success = employeeList.add(employee);
		return success;
	}

	// Update an employee
	public boolean updateEmployee(EmployeeDTO employee) {
		boolean success = employeeList.add(employee);
		return success;
	}

	// Delete an employee
	public boolean deleteEmployee(long id) {
		Iterator<EmployeeDTO> itr = employeeList.iterator();
		while (itr.hasNext()) {
			EmployeeDTO employee = itr.next();
			if (employee.getId() == id) {
				boolean success = employeeList.remove(employee);
				return success;
			}
		}
		return false;
	}
}
