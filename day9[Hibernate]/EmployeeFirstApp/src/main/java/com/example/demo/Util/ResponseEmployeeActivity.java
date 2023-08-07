package com.example.demo.Util;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.Employee;

public class ResponseEmployeeActivity {

	@Autowired
	private Employee employee;
	
	private String response;
	public String addEmployee() {
		response.format("%s", "added");
		return response;
	}
	
}
