public class Employee{
	private String employeeName;
	private String employeeNumber;
	private String employeeJoiningDate;
	private String employeeDateOfBirth;
	private int employeeAge;
	private String employeeAddress;
	
	public void setEmployeeName(String name){
		this.employeeName=name;
	}
	public String getEmployeeName(){
		return this.employeeName;
	}
	public void setEmpployeeNumber(String emp_no){
		this.employeeNumber=emp_no;
	}
	public String getEmployeeNumber(){
		return this.employeeNumber;
	}
	public void setEmployeeJoiningDate(String date){
		this.employeeJoiningDate=date;
	}
	public String getEmployeeJoiningDate(){
		return this.employeeJoiningDate;
	}
	public void setEmployeeDateOfBirth(String date){
		this.employeeDateOfBirth=date;
	}
	public String getEmployeeDateOfBirth(){
		return this.employeeDateOfBirth;
	}
	public void setEmpployeeAge(int age){
		this.employeeAge=age;
	}
	public int getEmployeeAge(){
		return this.employeeAge;
	}
	public void setEmployeeAddress(String address){
		this.employeeAddress=address;
	}
	public String getEmployeeAddress(){
		return employeeAddress;
	}

}