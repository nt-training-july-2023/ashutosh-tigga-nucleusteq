
public class Employee {
    private String empName;
    private int empId;
    private String empAddress;
    private String empEmail;
    private String empNumber;
    public String getEmpName() {
        return empName;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public String getEmpEmail() {
        return empEmail;
    }
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public String getEmpNumber() {
        return empNumber;
    }
    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public Employee() {
    }
    public Employee(String empName, int empId, String empAddress, String empEmail, String empNumber) {
        this.empName = empName;
        this.empId = empId;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
        this.empNumber = empNumber;
    }
     
}
