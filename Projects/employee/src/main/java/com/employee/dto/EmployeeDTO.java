package com.employee.dto;

import java.util.Date;

public class EmployeeDTO {

	private Long id;
	private String employeeName;
	private String department;
	private double salary;
	private String role;
	private Date birthDate;

	public EmployeeDTO(Long id, String employeeName, String department, double salary, String role, Date birthDate) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
		this.role = role;
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
