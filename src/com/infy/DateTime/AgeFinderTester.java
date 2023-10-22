package com.infy.DateTime;

import java.time.LocalDate;

public class AgeFinderTester {
    public static void main(String[] args) {
        AgeFinder ageFinder = new AgeFinder();
        System.out.println(ageFinder.getAge(LocalDate.of(1989,04,24)));
        System.out.println(ageFinder.getDateAfterNDays(24));
        System.out.println(ageFinder.getDateAfterXYearYMonthZDays(1999,03,24));
    }
}
