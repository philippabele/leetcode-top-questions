package com.main.leetcode.q020validparantheses;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ValidParanthesesTests {

    @Test
    public void exampleOne() {

        String s = "()";
        boolean output = true;
        boolean result = ValidParantheses.validPara(s);

        assertTrue(output == result);

    }

    @Test
    public void exampleTwo() {

        String s = "()[]{}";
        boolean output = true;
        boolean result = ValidParantheses.validPara(s);

        assertTrue(output == result);

    }

    @Test
    public void exampleThree() {

        String s = "(]";
        boolean output = false;
        boolean result = ValidParantheses.validPara(s);

        assertTrue(output == result);

    }

    @Test
    public void exampleFour() {

        String s = "[";
        boolean output = false;
        boolean result = ValidParantheses.validPara(s);
        assertTrue(output == result);

    }

    @Test
    public void exampleFive() {

        String s = "]";
        boolean output = false;
        boolean result = ValidParantheses.validPara(s);
        assertTrue(output == result);

    }

}
