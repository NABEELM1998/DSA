package org.example;


import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Nabeel", "developer", 45),
                new Employee(2, "Sara", "Dev", 800),
                new Employee(3, "ammu", "dev", 30),
                new Employee(4,"arun","senior",50)
        );

        Employee employee = new Employee();
        System.out.println(employee.getNthHighestSalary(employeeList,4));
    }


}
