package com.example.demo.Entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.*;
@Entity
@Table(name="employee_data")
public class Employee {

	@Column(name="serial_no",unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialNo;
	
	@Id
	@Column(name="employee_id" , unique = true,nullable = false , length=15)
	private String employeeId;
	
	@Column(name="employee_first_name" , nullable=false , length = 30)
	private String employoeeFirstName;
	
	@Column(name="employee_middle_name", nullable = true,length = 20)
	private String employeeMiddleName;
	
	@Column(name="employee_last_name" ,nullable = false, length = 30)
	private String employeeLastName;
	
	@Column(name = "employee_permanent_address",nullable = false,length = 100)
	private String employeePermanentAddress;
	
	@Column(name ="employee_current_address", nullable=false ,length = 100)
	private String employeeCurrentAddress;
	
	@Column(name="employee_email" , nullable = false,length=30 )
	private String employeeEmail;
	
	@Column(name="employee_joining_date",nullable = false)
	private Date employeeJoiningDate;

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployoeeFirstName() {
		return employoeeFirstName;
	}

	public void setEmployoeeFirstName(String employoeeFirstName) {
		this.employoeeFirstName = employoeeFirstName;
	}

	public String getEmployeeMiddleName() {
		return this.employeeMiddleName;
	}

	public void setEmployeeMmiddleName(String employeeMmiddleName) {
		this.employeeMiddleName = employeeMmiddleName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeePermanentAddress() {
		return employeePermanentAddress;
	}

	public void setEmployeePermanentAddress(String employeePermanentAddress) {
		this.employeePermanentAddress = employeePermanentAddress;
	}

	public String getEmployeeCurrentAddress() {
		return employeeCurrentAddress;
	}

	public void setEmployeeCurrentAddress(String employeeCurrentAddress) {
		this.employeeCurrentAddress = employeeCurrentAddress;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Date getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}

	public void setEmployeeJoiningDate(Date employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}

	@Override
	public String toString() {
		return "Employee [serialNo=" + serialNo + ", employeeId=" + employeeId + ", employoeeFirstName="
				+ employoeeFirstName + ", employeeMmiddleName=" + employeeMiddleName + ", employeeLastName="
				+ employeeLastName + ", employeePermanentAddress=" + employeePermanentAddress
				+ ", employeeCurrentAddress=" + employeeCurrentAddress + ", employeeEmail=" + employeeEmail
				+ ", employeeJoiningDate=" + employeeJoiningDate + "]";
	}

	public Employee(int serialNo, String employeeId, String employoeeFirstName, String employeeMmiddleName,
			String employeeLastName, String employeePermanentAddress, String employeeCurrentAddress,
			String employeeEmail, Date employeeJoiningDate) {
		super();
		this.serialNo = serialNo;
		this.employeeId = employeeId;
		this.employoeeFirstName = employoeeFirstName;
		this.employeeMiddleName = employeeMmiddleName;
		this.employeeLastName = employeeLastName;
		this.employeePermanentAddress = employeePermanentAddress;
		this.employeeCurrentAddress = employeeCurrentAddress;
		this.employeeEmail = employeeEmail;
		this.employeeJoiningDate = employeeJoiningDate;
	}

	public Employee() {
		super();
	}
	
	
	
}
