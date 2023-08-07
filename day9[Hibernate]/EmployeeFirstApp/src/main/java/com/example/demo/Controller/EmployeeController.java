package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.ServiceImpl.EmployeeServiceImpl;
import com.example.demo.Service.ServiceInterface.EmployeeServiceInterface;

@RestController
@RequestMapping("/springboot/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface  employeeService;
		
	
	/*
	 * 
	 * add employee Controller */
	@PostMapping("/addEmployeeController")
	private @ResponseBody Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("add employee controller method called");
		return employeeService.addEmployee(employee);
	} 
	
	/*
	 * 
	 * get employee Controller */
	@GetMapping("/getAllEmployeeController")
	private @ResponseBody List<Employee> getAllEmployee( ) {
		System.out.println("get all method called of controller");
		List<Employee> employeeList=employeeService.getEmployees();
		return employeeList;
	}
	/*
	 * 
	 * get employee Controller */
	@GetMapping("/getSingleEmployeeController/{employee_id}")
	private @ResponseBody Employee getSingleEmployee(@PathVariable("employee_id")String employeeId ) {
		System.out.println("get all method called of controller");
		Employee employee=employeeService.getSingleEmployees(employeeId);
		return employee;
	}

	/*
	 * 
	 * update employee Controller */
	@PutMapping("/updateEmployeeController/{employee_id}")
	private @ResponseBody Employee updateEmployee(@PathVariable("employee_id") String employeeId,@RequestBody Employee employee) {
		System.out.println("update method called of controller");
		return employeeService.updateEmployee(employeeId,employee);
	}
	
	/*
	 * 
	 * delete employee Controller */
	@DeleteMapping("/deleteEmployeeController/{employee_id}")
	private @ResponseBody void deleteEmployeeController(@PathVariable("employee_id") String employeeId) {
		System.out.println(" delte method called of controller");
		employeeService.deleteEmployee(employeeId);
	}
}
