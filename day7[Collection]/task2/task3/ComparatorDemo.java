import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employee("Ashutosh", 001, 30000));
        listOfEmployee.add(new Employee("Shiva", 006, 40000));
        listOfEmployee.add(new Employee("Shiva", 002, 40000));
        listOfEmployee.add(new Employee("Arvind", 003, 50000));
        System.out.println(listOfEmployee);
        Collections.sort(listOfEmployee, new Employee("", 0, 0));
        System.out.println();
        System.out.println(listOfEmployee);
    }
}
