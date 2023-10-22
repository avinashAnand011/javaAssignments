package com.infy.StaticModifier;

public class PerformanceRating extends Employee{
    static  final int OutStanding = 5;
    static final int Good= 4;
    static final int Average = 3;
   static final  int Poor = 2;

  public static   int rating = 0;
    static int calculatePerformance(Employee employee)
    {
        if (employee.getPoint() >= 80 && employee.getPoint() < 100) {
           rating= OutStanding;
        } else if (employee.getPoint() >= 60 && employee.getPoint() <= 79) {
            rating = Good;
        } else if (employee.getPoint() >= 50 && employee.getPoint() <= 59) {
            rating = Average;
        } else {
            rating=Poor;
        }
       // System.out.println(rating);
        return rating;
    }
}

