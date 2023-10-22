package com.infy.Constructors;

public class ChocolateTester {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate(101,"CAdbusry",12,10);
        System.out.println(chocolate);
        chocolate.setName("Milkybar");
        chocolate.setBarCode(102);
        chocolate.setWeight(24);
        chocolate.setCost(50);
        System.out.println("After updating : " + chocolate);

    }
}
