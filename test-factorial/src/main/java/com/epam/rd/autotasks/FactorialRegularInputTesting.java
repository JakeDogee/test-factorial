package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testZeroInput(){
        String expected = "1";
        String actual = factorial.factorial("0");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testZeroInputWrong(){
        String expected = "0";
        String actual = factorial.factorial("0");
        Assertions.assertEquals(expected,actual);
    }
}
