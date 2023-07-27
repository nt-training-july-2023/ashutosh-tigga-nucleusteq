public class Student extends Person{
	 String studentCourseEnrolled;
	 String studentCollegeName;
	 
	public Student(Person person, String studentCourseEnrolled, String studentCollegeName) {
		super(person.name, person.age, person.address);
		this.studentCourseEnrolled = studentCourseEnrolled;
		this.studentCollegeName = studentCollegeName;
	}


	public Student(String name, int age, String address) {
		super(name, age, address);
	}


	@Override
	public void speak(String lang){
		System.out.println(name+" can speak in "+lang);
	}

	public void speak(String lang1,String lang2){
		System.out.println(name+" can speak in "+ lang1+" , "+lang2);
	}
	
	@Override
	public void introduce(){
		toString();
	}
	public String toString(){
		return "Hello My name is "+name+" i am "+age+" year old "+"and i am from "+address+" i am currently pursing "
		+studentCourseEnrolled+" from "+studentCollegeName;
	}
}