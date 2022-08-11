package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial(null);
        });
    }

    @Test
    void testNegativeInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial(String.valueOf(-1));
        });
    }

    @Test
    void testFractionalInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial("9,3");
        });
    }

    @Test
    void testNonDigitalInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial("11adaq");
        });
    }


}
