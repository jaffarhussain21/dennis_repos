package com.employee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	 List<Employee> findAll(); 
	 
	 Optional<Employee> findById(Long id);
	 Employee findByEmployeeName(String employeeName);
	 void deleteById(Long id);	 
	 void delete(Employee employee);

}
