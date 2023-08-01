import java.util.*;
public class EmployeeCrud {
    private  HashMap<Integer,Employee> listMapOfEmployee=null;
    private  int key=0;

    public void addEmployee(Employee employee){
        if(listMapOfEmployee==null){
            listMapOfEmployee=new HashMap<Integer,Employee>();
        }else if(!listMapOfEmployee.isEmpty()){
            listMapOfEmployee.put(key++,employee);
        }
    }//end of add method

    public List<String> readEmployee(){
        if(listMapOfEmployee.isEmpty()){
            return null;
        }
        List<String> listOfEmp=new ArrayList<>();
        for (Map.Entry<Integer,Employee> entryOfEmployee :listMapOfEmployee.entrySet()) {
            Employee employee=entryOfEmployee.getValue();
            Integer key=entryOfEmployee.getKey();
            String employeeData=String.format("[ Employee Name:%s , id:%d , address:%s , email:%s , number:%s]",employee.getEmpName(),employee.getEmpId(),employee.getEmpAddress(),employee.getEmpEmail(),employee.getEmpNumber());
            listOfEmp.add(employeeData);
        }
        return listOfEmp;
    }//end of read method

    private Integer authenticate(int key){
        for (Map.Entry<Integer,Employee> entry: listMapOfEmployee.entrySet()) {
            if(entry.getKey()==key){
                return key;
            }else{
                return 0;
            }
        }
        return 0;
    }//end of authenticate method

    public boolean deleteEmployee(int key){
         if(authenticate(key)!=0){
            listMapOfEmployee.remove(key);
            return true;
        }else{
            return false;
        }
    }//end of delete method

    public Employee updateEmployee(int key,Employee employee){
        if(authenticate(key)!=0){
            listMapOfEmployee.put(key,employee);
            return listMapOfEmployee.get(key);
        }else{
            return null;
        }
    }//end of update method
}
