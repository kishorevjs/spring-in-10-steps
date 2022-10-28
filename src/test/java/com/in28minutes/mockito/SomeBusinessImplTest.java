package com.in28minutes.mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {

    @Test
    void test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(26, result);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retriveAllData() {
        return new int[]{26, 10, 22};
    }
}
