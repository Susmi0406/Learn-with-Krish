package com.krishantha.training.salesmanager.repository;

import java.util.List;

import com.krishantha.training.salesmanager.model.Employee.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}