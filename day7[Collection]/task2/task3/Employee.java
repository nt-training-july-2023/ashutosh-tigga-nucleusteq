import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee employee) {
        return employee.id - this.id;
    }

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id - emp2.id;
    }

}
