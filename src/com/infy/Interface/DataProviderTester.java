package com.infy.Interface;

public class DataProviderTester {
    public static void main(String[] args) {
        DataProvider dataProvider = new Intern(5000,500);
        dataProvider.calcPercentage();
        System.out.println(dataProvider);
        System.out.println("-------Trainee--------");
        DataProvider dataProvider1= new Trainee(6000);
        dataProvider1.calcPercentage();
        System.out.println(dataProvider1);

    }
}
