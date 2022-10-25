package com.in28minutes.junit;

public class MyMath {

    int calculateSum(int[] numbers){
        int sum = 0;

        for(int number:numbers){
            sum += number;
        }

        return sum;
    }
}
