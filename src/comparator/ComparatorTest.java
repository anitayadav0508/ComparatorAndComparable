package comparator;


import helper.BootstrappingData;

import java.math.BigInteger;
import java.util.*;
import java.util.ArrayList;

class Employee implements Comparator<Employee> {
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
    public int compare(Employee o1, Employee o2) {
        return 0;
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

public class ComparatorTest {
    public static void main(String[] args) {
        try {
            BootstrappingData<Employee> bootstrappingData = new BootstrappingData<Employee>(Employee.class);
            bootstrappingData.buildOne();
            System.out.println(bootstrappingData.getClass());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


