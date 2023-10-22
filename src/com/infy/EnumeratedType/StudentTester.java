package com.infy.EnumeratedType;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1000);
        student.setName("Alvin");
        student.setTotalmarks(280);
        student.calculateGrade();
        student.calculateScholarshipAmount();
        System.out.println(student);
    }
}
