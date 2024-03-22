package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {



        Company company = new Company(1, "Example Inc.", 10000.0, new String[10]);


        Employee employee = new Employee(1, "John Doe", "john@example.com", "password", new String[3]);



        Healthplan healthplan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);


        employee.addHealtPlan(0, healthplan.getName());


        company.addEmployee(0, employee.getFullName());


        System.out.println(company);
        System.out.println(employee);
    }
}