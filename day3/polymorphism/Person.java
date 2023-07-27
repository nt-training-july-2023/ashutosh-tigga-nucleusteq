public class Person{
	private String name;
	private int age;
	private String address;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age= age;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return this.address;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	
	public void speak(String lang){
		System.out.println(this.name+" can speak in "+lang);
	}
	
	public void introduce(){
		toString();
	}
	public String toString(){
		return "Hello My name is "+name+" i am "+age+" year old "+"and i am from "+address;
	}
}