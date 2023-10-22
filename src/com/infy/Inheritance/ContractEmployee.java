package com.infy.Inheritance;

public class ContractEmployee extends Employee{
    private double wages;
    private int hours;


    @Override
    public String toString() {
        return "ContractEmployee{" +
                "wages=" + wages +
                ", hours=" + hours +
                '}';
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary(){
        double salary2 = hours*wages;
        setSalary(salary2);
    }

}
