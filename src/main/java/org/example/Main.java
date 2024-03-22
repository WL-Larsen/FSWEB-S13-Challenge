package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Örnek company oluşturma
        Company company = new Company(1, "Example Inc.", 10000.0, new String[10]);

        // Örnek employee oluşturma
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password", new String[3]);

        // Örnek healthplan oluşturma

        Healthplan healthplan = new Healthplan(1, "Basic Health Plan", Plan.BASIC);

        // Örnek health planını employee'e ekleme
        employee.addHealtPlan(0, healthplan.getName());

        // Örnek employee'i company'e ekleme
        company.addEmployee(0, employee.getFullName());

        // Company ve employee bilgilerini yazdırma
        System.out.println(company);
        System.out.println(employee);
    }
}