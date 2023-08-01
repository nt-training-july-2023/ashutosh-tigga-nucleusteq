import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employee("Ashutosh", 001, 30000));
        listOfEmployee.add(new Employee("Shiva", 006, 40000));
        listOfEmployee.add(new Employee("Shiva", 002, 40000));
        listOfEmployee.add(new Employee("Arvind", 003, 50000));
        System.out.println(listOfEmployee);
        Collections.sort(listOfEmployee);
        System.out.println(listOfEmployee);
    }
}
