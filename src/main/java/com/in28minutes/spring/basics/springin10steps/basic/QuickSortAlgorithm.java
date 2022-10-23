package com.in28minutes.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers){

        //Logic for Bubble Sort
        return numbers;
    }
}
