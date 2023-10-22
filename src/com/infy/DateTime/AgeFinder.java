package com.infy.DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeFinder{

    public AgeFinder() {
    }

    public int getAge(LocalDate dateOfBirth) {
        LocalDate localDate= LocalDate.now();
        Period period = Period.between(dateOfBirth,localDate);
        return period.getYears();
        //Implementation required
    }
    public LocalDate getDateAfterNDays(int noOfDays) {
       LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusDays(noOfDays);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(localDate1.format(dateTimeFormatter));
        //Implementation required
    }
    public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
            LocalDate currentDate = LocalDate.now();
            LocalDate futureDate =  currentDate.plusMonths(month).plusDays(day).plusYears(year);
        //Implementation required
        return futureDate;
    }
}

