package com.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Employee Entity
class Employee {
    private int id;
    private String name;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

public class StreamSortEmployeeExamble {

    public static void main(String[] args) {
        //Create Employee List and Add Values
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "sathish", 15000));
        employeeList.add(new Employee(2, "kumar", 25000));
        employeeList.add(new Employee(3, "khan", 10000));
        employeeList.add(new Employee(4, "manoj", 5000));
        employeeList.add(new Employee(5, "akash", 50000));
        System.out.println(employeeList);

        //Sort by salary using Stream
        //Ascending
        employeeList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList())
                .forEach(System.out::println);
        //Descending
        employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList())
                .forEach(System.out::println);
        //Sort by Comparator.ComparatorLong used
        //Ascending
        employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList())
                .forEach(System.out::println);
        //Descending
        employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
