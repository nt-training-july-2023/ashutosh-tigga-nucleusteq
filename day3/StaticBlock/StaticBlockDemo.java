import java.util.ArrayList;
import java.util.List;

public class StaticBlockDemo {
    private static Student[] students=new Student[100];
    static{
        System.out.println("static block execute First");
        System.out.println("we can use this block for connecting resouces which is need to be start before execution of code ");
        students[0]=new Student("Ashu Tigga","jharkhand",21,"Manit Bhopal");
        students[1]=new Student("Ashutosh Tigga","jharkhand",22,"Manit Bhopal");
        System.out.println(students[0]);
    }
    public static List<Student> getAllStudent(){
        List<Student> listOfStudent=new ArrayList<>();
        System.out.println(listOfStudent);
        for(Student stu:students){
            listOfStudent.add( stu);
        }
        return listOfStudent;
    }
    public static void main(String args[]){
        System.out.println("Hello ");
        System.out.println("Student Info ");
        List<Student> listOfStudents=getAllStudent();
        for (Student student : listOfStudents) {
            if(student==null)
                break;
            System.out.println(student.getStudentName()+" "+student.getStudentAddress()+
            " "+student.getStudentRollNo()+student.getStudentCollegeName());
        }
        System.out.println("done");
    }

    
}
