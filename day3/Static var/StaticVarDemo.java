
public class StaticVarDemo {
    public static void main(String args[]){
        Student stu=new Student("Ashutosh Tigga","Jharkhand",21);
         Student stu1=new Student("Arvind Tigga","Jharkhand",22);
     Student stu2=new Student("shiva Tigga","Jharkhand",23);
     Student.setCollegeName("Manit Bhopal");
     System.out.println(stu);
          System.out.println(stu1);
               System.out.println(stu2);
    }
}
