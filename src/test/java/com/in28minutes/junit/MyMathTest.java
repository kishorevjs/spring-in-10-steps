package com.in28minutes.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    void calculateSumTest(){
        assertEquals(6, myMath.calculateSum(new int[]{1,2,3}));
    }

    @Test
    void checkZeroSumTest(){
        assertEquals(0, myMath.calculateSum(new int[]{}));
    }
}
