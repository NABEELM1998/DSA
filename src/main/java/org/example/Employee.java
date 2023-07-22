package org.example;

import java.util.List;


public class Employee {
    private int id;
    private String name;
    private String designation;
    private int salary;

    public Employee() {

    }

    public Employee(int id, String name, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return this.designation;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNthHighestSalary(List<Employee> list,int n){
        List<Integer> salaryList = list.stream().map(Employee::getSalary).toList().stream().sorted().toList();
        System.out.println(salaryList);
        return salaryList.get(salaryList.size() - n);
    }
}
