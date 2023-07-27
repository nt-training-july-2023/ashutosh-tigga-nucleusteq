public class SingleInherDemo{
    public static void main(String arg[]){
        Person person=new Person("Ashutosh Tigga",24,"Jharkhand");
       Student student=new Student(person, "MCA", "Manit BHOPAL");
       System.out.println(person);
       System.out.println(student);
       student.eat();
       student.sing();

    }
}