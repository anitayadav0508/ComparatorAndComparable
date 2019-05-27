package comparable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Employee implements Comparable<Employee>  {
    private String name;
    private Integer empCode;
    private String salary;

    public Employee() {
    }

    public Employee(String name, Integer empCode, String salary) {
        this.name = name;
        this.empCode = empCode;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empCode - o.empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpCode() {
        return empCode;
    }

    public void setEmpCode(Integer empCode) {
        this.empCode = empCode;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empCode=" + empCode +
                ", salary='" + salary + '\'' +
                '}';
    }
}





public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("arul suju", 81, "12 lAKH P.A"));
        employeeList.add(new Employee("gyan yadav", 85, "10 lAKH P.A"));
        employeeList.add(new Employee("anita yadav", 70, "15 lAKH P.A"));
        employeeList.add(new Employee("naveen", 60, "16 lAKH P.A"));
        System.out.println("Before Sorting list is" + employeeList);
        Collections.sort(employeeList);
        System.out.println("After sorting list is" + employeeList);
    }
}
