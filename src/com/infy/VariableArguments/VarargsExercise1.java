package com.infy.VariableArguments;

import java.util.Arrays;
import java.util.OptionalDouble;

public class VarargsExercise1 {
        public  void displayList( int... input ){
            for(int i : input){
                System.out.println(i);
            }

        }
        public void maxOfList(int... input){
            int max = input[0];
            for (int i : input){
                max = Math.max(max,i);
            }
            System.out.println(max);

        }
        public void sortList(int... input){
            Arrays.sort(input);
            displayList(input);

        }
        public void averageList(int... input){
            System.out.println(Arrays.stream(input).average());

        }
    }

