package com.infy.ConditionalStatements;

public class ReverseCalculator {
    public static void main(String[] args) {
        int originalNumber = 72;
        int reversedNumber = 0;


        while (originalNumber!=0){
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber = originalNumber / 10;
        }
        System.out.println("Reversed number using while- loop : " + reversedNumber);

        int originalNumber1 = 72;
        int reversedNumber1 = 0;
        for(;  originalNumber1 != 0; originalNumber1=originalNumber1/10){
            int digit = originalNumber1 % 10;
            reversedNumber1 = reversedNumber1 * 10 +digit;
        }
        System.out.println("Reversed number usinf for loop : " + reversedNumber1);

        int originalNumber2 = 72;
        int reversedNumber2 = 0;
        do {
            int digit1 = originalNumber2 % 10;
            reversedNumber2 = reversedNumber2 * 10 + digit1;
            originalNumber2 = originalNumber2 / 10;

        }while (originalNumber2 !=0);

        System.out.println("reversed number using do-while Loop " + reversedNumber2);

    }
}
