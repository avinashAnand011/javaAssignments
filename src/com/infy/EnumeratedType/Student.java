package com.infy.EnumeratedType;
public class Student {
    private int studentId;
    private String name;
    private Grade  grade;
    private int scholarshipAmount;
    private  int totalmarks =0;

    public void calculateGrade(){
        if (totalmarks>=250){
            grade=Grade.A;
        } else if(totalmarks >= 200 && totalmarks < 250){
            grade=Grade.B;
        } else if (totalmarks >= 175 && totalmarks < 200) {
            grade=Grade.C;
        } else if (totalmarks >= 150 && totalmarks < 175) {
            grade=Grade.D;
        }else {
            grade=Grade.E;
        }

    }

    public void calculateScholarshipAmount(){
        switch (grade){
            case A :
                scholarshipAmount=5000;
                break;
            case B:
                scholarshipAmount=4000;
                break;
            case C:
                scholarshipAmount=3000;
                break;
            case D:
                scholarshipAmount=2000;
                break;
            default:
                scholarshipAmount=0;
        }

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(int scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    public int getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", scholarshipAmount=" + scholarshipAmount +
                ", totalmarks=" + totalmarks +
                '}';
    }
}
