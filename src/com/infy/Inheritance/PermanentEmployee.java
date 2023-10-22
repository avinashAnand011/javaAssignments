package com.infy.Inheritance;

public class PermanentEmployee extends Employee{
    private double basicPay;
    private double hra;
    private int experience;



    Employee employee = new Employee();
    public double getBasicPay() {
        return basicPay;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "basicPay=" + basicPay +
                ", hra=" + hra +
                ", experience=" + experience +
                ", employee=" + employee +
                '}';
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary(){
        double variableComponent = 0;
        if(experience<3){
            variableComponent=0;
        } else if(experience>=3 && experience<=5){
            variableComponent=0.05*basicPay;
        }else if(experience>=5 && experience<10){
            variableComponent=0.07*basicPay;
        } else if(experience>= 10) {
            variableComponent=0.12*basicPay;
        }else{
            System.out.println("Invalid input");
        }
        double salary1 = variableComponent+basicPay+hra;

        setSalary(salary1);
    }
}
