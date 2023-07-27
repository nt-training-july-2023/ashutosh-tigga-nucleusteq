
public class Person{
	 String name;
	 int age;
	 String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void speak(String lang){
		System.out.println(this.name+" can speak in "+lang);
	}
	public void eat(){
		System.out.println(name+" is eating ");
	}

	public void sing(){
		System.out.println(name+" is singing ");
	}
	public void introduce(){
		toString();
	}
	public String toString(){
		return "Hello My name is "+name+" i am "+age+" year old "+"and i am from "+address;
	}
}