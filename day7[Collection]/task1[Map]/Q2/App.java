import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("  Employee Crud Operation: ");
        Employee employee=null;
        EmployeeCrud empCrud=new EmployeeCrud();
        while (true) {
            System.out.println(" 1 ==> Add Employee ");
            System.out.println(" 2 ==> Update Employee ");
            System.out.println(" 3 ==> Delete Employee ");
            System.out.println(" 4 ==> Read Employee ");
            System.out.println(" 5 ==> Exit ");
            System.out.println();   
            switch (sc.nextInt()) {
                case 1:
                    employee=new Employee();
                    System.out.println(" Enter Employee Name : ");
                    employee.setEmpName(sc.nextLine());
                    sc.next();
                    System.out.println(" Enter Employee Id :");
                    employee.setEmpId(sc.nextInt());
                    System.out.println(" Enter Employee Address :");
                    sc.nextLine();
                    employee.setEmpAddress(sc.nextLine());
                    System.out.println(" Enter Employee Email :");
                    employee.setEmpEmail(sc.nextLine());
                    System.out.println(" Enter Employee Number :");
                    employee.setEmpNumber(sc.nextLine());
                    empCrud.addEmployee(employee);
                    break;
                case 2:
                    System.out.println("Enter Key :");
                    int key=sc.nextInt();
                    employee=new Employee();
                    System.out.println(" Enter Employee Name : ");
                    employee.setEmpName(sc.nextLine());
                    sc.next();
                    System.out.println(" Enter Employee Id :");
                    employee.setEmpId(sc.nextInt());
                    System.out.println(" Enter Employee Address :");
                    sc.nextLine();
                    employee.setEmpAddress(sc.nextLine());
                    System.out.println(" Enter Employee Email :");
                    employee.setEmpEmail(sc.nextLine());
                    System.out.println(" Enter Employee Number :");
                    employee.setEmpNumber(sc.nextLine());
                    if(empCrud.updateEmployee(key,employee)==null){
                        System.out.println(" No Data Found ");
                    }else{
                        System.out.println(employee+" Updated");
                    }
                    break;   
                case 3:
                    System.out.println("Enter Key :");
                    key=sc.nextInt();
                    boolean isEmpPresent=empCrud.deleteEmployee(key);
                    if(isEmpPresent){
                        System.out.println(" Deleted Successfully ");
                    }else{
                        System.out.println(" No Data Found ");
                    }
                    break;
                case 4:
                    List<String> listOfEmployee=empCrud.readEmployee();
                    if(listOfEmployee==null){
                        System.out.println("No data found");
                    }else{
                        for (String employeeData : listOfEmployee) {
                            System.out.println(employeeData);
                        }
                    }
                    break;  
                case 5:
                    System.exit(0);
                    break;  
                default:
                    break;
            }
        }
    }
}
