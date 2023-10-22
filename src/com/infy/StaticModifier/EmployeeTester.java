package com.infy.StaticModifier;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setPoint(56);
        PerformanceRating.calculatePerformance(employee) ;
        System.out.println(employee);
        System.out.println(PerformanceRating.rating);
    }

}
