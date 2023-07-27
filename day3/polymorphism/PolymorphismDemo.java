public class PolymorphismDemo{
    public static void main(String args[]){

        Person person1=new Person();
        person1.setName("Ashutosh TIgga");
        person1.setAge(24);
        person1.setAddress("Chaibasa ,West singhbhum , Jharkhand");

        Student student1=new Student(person1,"MCA","Manit BHOPAL");
        Employee employee1=new Employee(student1,"17 July 2023","NucleusTeq");
       
    }
}