package com.employee.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.dto.Employee;

@Service
public class EmployeeService {
	private static List<Employee> employeeList = new LinkedList<Employee>();
	Long employeeCount = (long) employeeList.size();

	static {
		System.out.println("******Static block called******");
		employeeList.add(new Employee(1, "Jack", "HR", 10000, "HR-Specialist"));
		employeeList.add(new Employee(2, "Fred", "Admin", 20000, "Admin-Specialist"));
		employeeList.add(new Employee(3, "Dennis", "IT", 25000, "IT-Specialist"));

	}

	public EmployeeService() {
		super();
		System.out.println("******Constructor block called******");
	}

	// Retrieve All employees
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	// Retrieve a single employee
	public Employee getEmployee(long id) {
		for (Employee e : employeeList) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	// Create a new employee
	public boolean createEmployee(Employee employee) {
		if (employee.getId() == null) {
			employee.setId(++employeeCount);
		}
		boolean success = employeeList.add(employee);
		return success;
	}

	// Update an employee
	public boolean updateEmployee(Employee employee) {
		boolean success = employeeList.add(employee);
		return success;
	}

	// Delete an employee
	public boolean deleteEmployee(long id) {
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			if (employee.getId() == id) {
				boolean success = employeeList.remove(employee);
				return success;
			}
		}
		return false;
	}
}
