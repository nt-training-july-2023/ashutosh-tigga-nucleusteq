public class Employee extends Student{
    private String employeeNumber;
	private String employeeJoiningDate;
	private String employeeCompanyName;
	
	public Employee(Person person, String studentCourseEnrolled, String studentCollegeName, String employeeNumber,
			String employeeJoiningDate, String employeeCompanyName) {
		super(person, studentCourseEnrolled, studentCollegeName);
		this.employeeNumber = employeeNumber;
		this.employeeJoiningDate = employeeJoiningDate;
		this.employeeCompanyName = employeeCompanyName;
	}
	public Employee(String name, int age, String address, String employeeNumber, String employeeJoiningDate,
			String employeeCompanyName) {
		super(name, age, address);
		this.employeeNumber = employeeNumber;
		this.employeeJoiningDate = employeeJoiningDate;
		this.employeeCompanyName = employeeCompanyName;
	}
	public String getEmployeeCompanyName() {
		return employeeCompanyName;
	}
	public void setEmployeeCompanyName(String employeeCompanyName) {
		this.employeeCompanyName = employeeCompanyName;
	}
	public void setEmployeeName(String name){
		name=name;
	}
	public String getEmployeeName(){
		return name;
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
		age=age;
	}
	public int getEmployeeAge(){
		return age;
	}
	public void setEmployeeAddress(String address){
		address=address;
	}
	public String getEmployeeAddress(){
		return address;
	}
	@Override
	public void speak(String lang1,String lang2){
		System.out.println(name+" can speak in "+lang1+" "+lang2+" also he can speak anothe language professsionlly");
	}
	@Override
	public void introduce(){
		this.toString();
	}

	@Override
	public String toString(){
		return  "Hello My name is "+name+" i am "+age+" year old "+"and i am from "+address+
		" i am currently working in  "
		+employeeCompanyName;
	}
}