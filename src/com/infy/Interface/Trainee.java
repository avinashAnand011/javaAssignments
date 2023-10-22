package com.infy.Interface;

public class Trainee implements DataProvider{

    private int marksSecured;

    public Trainee() {
    }

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    @Override
    public void calcPercentage() {
        System.out.println(((double)(marksSecured)/totalMaximumMarks)*100);

    }

    @Override
    public String toString() {
        return "Trainee{" +
                "marksSecured=" + marksSecured +
                '}';
    }
}
