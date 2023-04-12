package org.knoldus.task16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id, otherEmployee.getId());
    }
}

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jitin", 1001, 54000.0));
        employees.add(new Employee("Salil", 1006, 43000.0));
        employees.add(new Employee("Riya", 1008, 69000.0));
        employees.add(new Employee("Anshika", 1003, 34000.0));

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.getId() + " - " + employee.getSalary());
        }
    }
}
