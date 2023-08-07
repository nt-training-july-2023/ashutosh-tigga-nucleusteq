package com.example.demo.Service.ServiceInterface;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeServiceInterface  {

	/*
	 * 
	 * add employee method  */
	Employee addEmployee(Employee employee);

	/*
	 * 
	 * update employee method */
	Employee updateEmployee(String employeeId, Employee employee);

	/*
	 * 
	 * delete employee method */
	void deleteEmployee(String employeeId);

	/*
	 * 
	 * get employee method */
	List<Employee> getEmployees();

	Employee getSingleEmployees(String employeeId);

}
