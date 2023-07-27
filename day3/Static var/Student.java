

public class Student {
    private String studentName;
    private String studentAddress;
    private static String collegeName;
    private int rollNo;
    
    public Student(String studentName, String studentAddress, int rollNo) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.rollNo = rollNo;
    }
    public String getStudentName() {
        return studentName;
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
    public static String getCollegeName() {
        return collegeName;
    }
    public static void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String toString(){
        return "name :"+studentName+" Address :"+studentAddress+" College Name : "+collegeName+" Roll no : "+rollNo;
    }
}
