package com.infy.Exceptions;
public class TryMathCube {

        public int cube ( int n){
        return n * n * n;
    }


    public static void main(String[] args) {
        TryMathCube tc = new TryMathCube();

        try{
            int num = Integer.parseInt("One");
            System.out.println(tc.cube(num));
        }
        catch (NumberFormatException N){
            System.out.println("Please Enter Number");
        }
    }
}
