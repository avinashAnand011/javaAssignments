package com.infy.ConditionalStatements;

public class FunCalculator {

    public static boolean isArmstrong(int number){
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while(number>0) {

            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static boolean isLucky(int number){
        int sumOfSquares =0;
        int position = 0;
        while(number >0){
            int digit = number % 10;
            position++;
            if(position %2 == 0){
                sumOfSquares += digit*digit;
            }
            number= number/10;
        }
        return sumOfSquares%9==0;
    }
    public static void main(String[] args) {
        int armstrongNumber = 153;
        int luckynumber  = 1623;

        if (isArmstrong(armstrongNumber)){
            System.out.println(armstrongNumber + " is an Armstrong Number");
        }else{
            System.out.println(armstrongNumber+" is not a Armstrong number");
        }

        if(isLucky(luckynumber)){
            System.out.println(luckynumber+" is a lucky number ");
        }else{
            System.out.println( luckynumber + " is not a lucky number");
        }
    }
}
