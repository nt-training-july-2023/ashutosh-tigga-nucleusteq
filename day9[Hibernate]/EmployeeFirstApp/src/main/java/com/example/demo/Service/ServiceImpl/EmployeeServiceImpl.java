package com.example.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.ServiceInterface.EmployeeServiceInterface;


@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{
	
	@Autowired
	private EmployeeRepo employoeeRepo;
	
	/*
	 * 
	 * method for adding employee */
	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("add employee method called of service");
		Employee employee1=employoeeRepo.save(employee);
		return employee;
	}
	
	/*
	 *
	 * method for Getting employee Data*/
	@Override
	public List<Employee> getEmployees() {
		System.out.println("get employee method called of service");
		List<Employee> employeeList=this.employoeeRepo.findAll();
		System.out.println("list of Employee "+employeeList);
		return employeeList;
	}
	
	
	/*
	 * 
	 * method for update employee*/
	@Override
	public Employee updateEmployee(String employeeId, Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("update employee method called of service");
		Employee fetchEmployee=this.employoeeRepo.findById(employeeId).orElseThrow();
		fetchEmployee.setEmployoeeFirstName(employee.getEmployoeeFirstName());
		fetchEmployee.setEmployeeMmiddleName(employee.getEmployeeMiddleName());
		fetchEmployee.setEmployeeLastName(employee.getEmployeeLastName());
		fetchEmployee.setEmployeePermanentAddress(employee.getEmployeePermanentAddress());
		fetchEmployee.setEmployeeCurrentAddress(employee.getEmployeeCurrentAddress());
		fetchEmployee.setEmployeeEmail(employee.getEmployeeEmail());
		return this.employoeeRepo.save(fetchEmployee);
	}

	/*
	 * 
	 * method for Deleting employee */
	@Override
	public void deleteEmployee(String employeeId) {
		// TODO Auto-generated method stub
		System.out.println("delte method called of service");
		Employee fetchEmployee=this.employoeeRepo.findById(employeeId).orElseThrow();
		 this.employoeeRepo.delete(fetchEmployee);
	}

	@Override
	public Employee getSingleEmployees(String employeeId) {
		// TODO Auto-generated method stub
		
		return this.employoeeRepo.findById(employeeId).orElseThrow();
	}

	





	
	
	
}
