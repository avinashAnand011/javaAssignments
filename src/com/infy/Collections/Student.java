package com.infy.Collections;

import java.util.*;

public class Student {
    //
        private String name;
        private int rollNumber;

        private  int totalMarks;

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Student() {
    }

    public Student(String name, int rollNumber, int totalMarks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.totalMarks= totalMarks;
        }

        public void calculateGrade(int totalMarks){
            if(getTotalMarks() >= 60){
                System.out.println("A");
            } else if (getTotalMarks() >= 40 && getTotalMarks() < 40) {
                System.out.println("B");
            }else {
                System.out.println("C");
            }
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }
        //add toString() method


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", totalMarks=" + totalMarks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getRollNumber() == student.getRollNumber() && getTotalMarks() == student.getTotalMarks() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRollNumber(), getTotalMarks());
    }
}


