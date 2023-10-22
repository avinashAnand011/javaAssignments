package com.infy.Inheritance;

public class EmployeeRecords {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();
        permanentEmployee.setName("Anil");
        permanentEmployee.setEmpId(101);
        permanentEmployee.setBasicPay(10000);
        permanentEmployee.setHra(1500);
        permanentEmployee.setExperience(3);
        permanentEmployee.calculateSalary();

        System.out.println("Permanent Employee : " + permanentEmployee.getSalary());

        contractEmployee.setName("ramesh");
        contractEmployee.setHours(15);
        contractEmployee.setWages(30000);
        contractEmployee.setEmpId(102);

        contractEmployee.calculateSalary();

        System.out.println("Contract Employee " + contractEmployee.getSalary());



    }
}
