package com.infy.Arrays;

import java.util.Arrays;

public class EmployeeRecord {

    double avgSalary=0;

    public void SalaryInsight(double[] salary){
        int less=0, more=0;

        avgSalary= Arrays.stream(salary).sum()/ salary.length;

        for(double x:salary) {
            if (x > avgSalary) more++;
            else if (x < avgSalary) less++;
        }
        System.out.println("Average Salary of employees : "+ avgSalary);
        System.out.println("employees with salary more than avg Salary: " + more);
        System.out.println("employees with salary less than avg Salary: " + less);
    }

}
