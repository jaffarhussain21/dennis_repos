package com.employee.dto;

public class Employee {

	private Long id;
	private String name;
	private String department;
	private double salary;
	private String role;

	public Employee(long id, String name, String department, double salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
