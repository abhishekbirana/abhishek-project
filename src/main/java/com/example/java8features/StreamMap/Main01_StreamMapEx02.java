package com.example.java8features.StreamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String empName;
    int salary;
    Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class Main01_StreamMapEx02 {
    public static void main(String[] args) {
//        List<Employee> employeesList = new ArrayList<>();
//        employeesList.add(new Employee(1,"ramu", 1000));

        List<Employee> employeesList = Arrays.asList(
                new Employee(1,"Amit",1000),
                new Employee(2,"Ankit",2000),
                new Employee(2,"Ashish",3000)
        );
        List<String> salary = employeesList.stream()
                .filter(employee -> employee.salary > 1500)
                .map(employee -> employee.empName)
                .collect(Collectors.toList());

        System.out.println(salary);
    }
}
