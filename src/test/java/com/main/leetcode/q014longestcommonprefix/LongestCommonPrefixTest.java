package com.main.leetcode.q014longestcommonprefix;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void exampleOne() {

        String[] s = new String[] { "flower", "flow", "flight" };
        String output = "fl";
        String result = LongestCommonPrefix.lcp(s);

        assertTrue(output.equals(result));

    }

    @Test
    public void exampleTwo() {

        String[] s = new String[] { "dog", "racecar", "car" };
        String output = "";
        String result = LongestCommonPrefix.lcp(s);

        assertTrue(output.equals(result));

    }

    @Test
    public void exampleThree() {

        String[] s = new String[] { "" };
        String output = "";
        String result = LongestCommonPrefix.lcp(s);

        assertTrue(output.equals(result));

    }

    @Test
    public void exampleFour() {

        String[] s = new String[] { "", "" };
        String output = "";
        String result = LongestCommonPrefix.lcp(s);

        assertTrue(output.equals(result));

    }

}
