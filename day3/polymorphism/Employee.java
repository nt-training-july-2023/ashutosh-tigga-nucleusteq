public class Employee extends Student{
	private String employeeName;
	private String employeeNumber;
	private String employeeJoiningDate;
	private int employeeAge;
	private String employeeAddress;
	private String employeeCompanyName;
	public Employee(Student student,String date,String companyName) {
		this.employeeName = student.getStudentName();
		this.employeeAge = student.getStudentAge();
		this.employeeAddress = student.getStudentAddress();
		this.employeeJoiningDate=date;
		this.employeeCompanyName=companyName;
	}
	public String getEmployeeCompanyName() {
		return employeeCompanyName;
	}
	public void setEmployeeCompanyName(String employeeCompanyName) {
		this.employeeCompanyName = employeeCompanyName;
	}
	public void setEmployeeName(String name){
		this.employeeName=name;
	}
	public String getEmployeeName(){
		return this.employeeName;
	}
	public void setEmployeeNumber(String emp_no){
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
	@Override
	public void speak(String lang1,String lang2){
		System.out.println(employeeName+" can speak in "+lang1+" "+lang2+" also he can speak anothe language professsionlly");
	}
	@Override
	public void introduce(){
		this.toString();
	}

	@Override
	public String toString(){
		return  "Hello My name is "+employeeName+" i am "+employeeAge+" year old "+"and i am from "+employeeAddress+
		" i am currently working in  "
		+employeeCompanyName;
	}
}