public class Student extends Person{
	private String studentName;
	private String studentAddress;
	private int studentAge;
	private String studentCourseEnrolled;
	private String studentCollegeName;
	
	public Student(Person person,String course,String collegeName) {
		this.studentName = person.getName();
		this.studentAddress = person.getAddress();
		this.studentAge = person.getAge();
		this.studentCourseEnrolled=course;
		this.studentCollegeName=collegeName;
	}
	public void setStudentCollegeName(String collegeName){
		this.studentCollegeName=collegeName;
	}
	public String getStudentCollegeName(){
		return studentCollegeName;
	}
	public void setStudentName(String name){
		this.studentName=name;
	}
	public void setStudentAddress(String address){
		this.studentAddress=address;
	}
	public void setStudentAge(int age){
		this.studentAge=age;
	}
	public void setStudentCourseEnrolled(String course){
		this.studentCourseEnrolled=course;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public String getStudentAddress(){
		return this.studentAddress;
	}
	public int getStudentAge(){
		return this.studentAge;
	}
	public String getStudentCourseEnrolled(){
		return this.studentCourseEnrolled;
	}
	
	@Override
	public void speak(String lang){
		System.out.println(this.studentName+" can speak in "+lang);
	}

	public void speak(String lang1,String lang2){
		System.out.println(studentName+" can speak in "+ lang1+" , "+lang2);
	}
	
	@Override
	public void introduce(){
		toString();
	}
	public String toString(){
		return "Hello My name is "+studentName+" i am "+studentAge+" year old "+"and i am from "+studentAddress+" i am currently pursing "
		+studentCourseEnrolled+" from "+studentCollegeName;
	}
}