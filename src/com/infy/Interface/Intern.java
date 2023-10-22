package com.infy.Interface;

public class Intern implements DataProvider{
    private int marksSecured;
    private int graceMarks;

    public Intern() {
    }

    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }


    @Override
    public void calcPercentage() {
        double totalMarks = graceMarks+marksSecured;
        System.out.println((totalMarks/totalMaximumMarks)*100);
    }

    @Override
    public String toString() {
        return "Intern{" +
                "marksSecured=" + marksSecured +
                ", graceMarks=" + graceMarks +
                '}';
    }
}
