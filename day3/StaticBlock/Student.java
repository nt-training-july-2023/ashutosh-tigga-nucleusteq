
public class Student {
    private String studentName;
    private String studentAddress;
    private static String studentCollegeName;
    private int studentRollNo;
    
   
    public String getStudentName() {
        return studentName;
    }
    public Student(String studentName, String studentAddress, int studentRollNo,String studentCollegeName) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentRollNo = studentRollNo;
        this.studentCollegeName=studentCollegeName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public static String getStudentCollegeName() {
        return studentCollegeName;
    }
    public static void setStudentCollegeName(String collegeName) {
        Student.studentCollegeName = collegeName;
    }
    public int getStudentRollNo() {
        return studentRollNo;
    }
    public void setStudentRollNo(int rollNo) {
        this.studentRollNo = rollNo;
    }
    public String toString(){
        return "name :"+studentName+" Address :"+studentAddress+" College Name : "+studentCollegeName+" Roll no : "+studentRollNo;
    }
}
