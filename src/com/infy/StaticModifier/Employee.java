package com.infy.StaticModifier;

public class Employee {
     private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "point=" + point +
                '}';
    }
}
