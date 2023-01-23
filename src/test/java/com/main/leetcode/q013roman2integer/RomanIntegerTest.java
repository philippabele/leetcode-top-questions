package com.main.leetcode.q013roman2integer;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RomanIntegerTest {

    @Test
    public void exampleOne() {

        String s = "III";
        int output = 3;
        int result = RomanInteger.romanInteger(s);

        assertTrue(output == result);

    }

    @Test
    public void exampleTwo() {

        String s = "LVIII";
        int output = 58;
        int result = RomanInteger.romanInteger(s);

        assertTrue(output == result);

    }

    @Test
    public void exampleThree() {

        String s = "MCMXCIV";
        int output = 1994;
        int result = RomanInteger.romanInteger(s);

        assertTrue(output == result);

    }

}
