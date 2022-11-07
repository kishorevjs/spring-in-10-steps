package com.in28minutes.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplTest {

    @Mock
    private DataService dataServiceMock;
    private List listMock = mock(List.class);

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void positiveNumbersTest(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{20, 20});
        assertEquals(20, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void negativeNumbersTest(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{-10, -5, -1});
        assertEquals(-1, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void emptyArrayTest(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{});
        assertEquals(-2147483648, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void notEqualsTest(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{});
        assertNotEquals(10, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void multipleInputTypeTest(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{'a', 10});
        assertEquals(97, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void listSizeTest(){

        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }

    @Test
    void listParameterTest(){

        when(listMock.get(0)).thenReturn("KishoreVjs");
        assertEquals("KishoreVjs", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void returnTypeTest(){

        when(listMock.get(Mockito.anyInt())).thenReturn("Vjs");
        assertEquals("Vjs", listMock.get(1304));
    }
}