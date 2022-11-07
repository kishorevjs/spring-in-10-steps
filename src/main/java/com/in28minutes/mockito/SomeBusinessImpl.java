package com.in28minutes.mockito;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
        int[] data = dataService.retriveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int value:data){
            if(value > greatestValue)
                greatestValue = value;
        }
        return greatestValue;
    }
}