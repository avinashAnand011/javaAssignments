package com.infy.StaticModifier;

public class LoanTester{
    public static void main(String[] args) {
        Loan loan = new Loan();
        Loan loan1 = new Loan(1, 23, 45, 345435.0f, 23,5.0f);
       // System.out.println(loan1);
        Loan loan3 = new Loan(1, 23, 45, 345435.0f, 23,5.0f);
        Loan loan2 = new Loan(1, 23, 45, 345435.0f, 23,5.0f);
        System.out.println(Loan.getLoanCounter());


    }
}
