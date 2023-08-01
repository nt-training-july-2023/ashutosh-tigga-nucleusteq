import java.util.*;
public class App {
    HashMap<Integer,String> mapOfEmployee = null;

    void addData(ArrayList<Employee> listOfEmp) {
        mapOfEmployee=new HashMap<Integer,String>();
        for (Employee employee : listOfEmp) {
            mapOfEmployee.put( employee.getEmpId(),employee.getEmpName());
        }
    }
    void readData(){
        for (Map.Entry<Integer,String> entryOfEmployee :mapOfEmployee.entrySet()) {
            String empName=entryOfEmployee.getValue();
            Integer empId=entryOfEmployee.getKey();
            System.out.printf("[ Employee Id:%d , Employee Name:%s ]",empId,empName);
        }--
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        App empApp=new App();
        ArrayList<Employee> listOfEmp = new ArrayList<Employee>();
        System.out.println("how many Employee data you want to input :");
        int input=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <input; i++) {
            System.out.println("Enter Employee "+ i+" Name ");
            listOfEmp.add(new Employee(sc.nextLine(),i));
        }
        empApp.addData(listOfEmp);
        empApp.readData();

    }
}
