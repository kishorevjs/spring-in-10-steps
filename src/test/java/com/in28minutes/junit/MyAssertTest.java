package com.in28minutes.junit;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAssertTest {

    List<String> todos = Arrays.asList("Gal Gadot", "Ana DeArms", "Elizabeth Oslen");

    @Test
    void containsTest(){
        boolean test = todos.contains("Gal Gadot");
        assertEquals(true, test);
    }

    @Test
    void sizeTest(){
        assertEquals(3, todos.size());
    }
}