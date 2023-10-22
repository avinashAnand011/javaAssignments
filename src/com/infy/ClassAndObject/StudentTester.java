package com.infy.ClassAndObject;

import com.infy.ClassAndObject.ClassesAndObject;

public class StudentTester {

    public static void main(String[] args){
        //Create an object of Student class
        //Use setter methods to set the values
        //Use getter methods with proper escape sequences to display values
        ClassesAndObject c = new ClassesAndObject();
        int id = c.getStudentId(1213491);
        String  name=  c.getName("avinash");
        float qaulifyingMarks = c.getQualifyingExamMarks(80);
        char resdetialStatus = c.getResidentialStatus('H');
        int yearOfEngg = c.getYearOfEngg(3);
        System.out.println("Student Id " + id);
        System.out.println("Student Name  " + name);
        System.out.println("Qualifying Mark " + qaulifyingMarks );
        System.out.println("Residential Status " + resdetialStatus);
        System.out.println("year of Engg " + yearOfEngg);


    }

}
