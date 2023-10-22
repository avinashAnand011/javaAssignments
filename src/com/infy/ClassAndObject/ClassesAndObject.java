package com.infy.ClassAndObject;

public class ClassesAndObject {

        //Create an object of Student class
        //Use setter methods to set the values
        //Use getter methods with proper escape sequences to display values

    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;



    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    public int getStudentId(int studentId) {
        return studentId;
    }

    public String getName(String name) {
        return name;
    }

    public float getQualifyingExamMarks(float qualifyingExamMarks) {
        return qualifyingExamMarks;
    }

    public char getResidentialStatus(char residentialStatus) {
        return residentialStatus;
    }

    public int getYearOfEngg(int yearOfEngg) {
        return yearOfEngg;
    }


}
