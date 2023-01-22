package com.main.leetcode.q001twosum;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void exampleOne() {

        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] output = new int[] { 0, 1 };
        int[] result = TwoSum.twoSum(nums, target);

        assertTrue(Arrays.equals(result, output));
    }

    @Test
    public void exampleTwo() {

        int[] nums = new int[] { 3, 2, 4 };
        int target = 6;
        int[] output = new int[] { 1, 2 };
        int[] result = TwoSum.twoSum(nums, target);

        assertTrue(Arrays.equals(result, output));
    }

    @Test
    public void exampleThree() {

        int[] nums = new int[] { 3, 3 };
        int target = 6;
        int[] output = new int[] { 0, 1 };
        int[] result = TwoSum.twoSum(nums, target);

        assertTrue(Arrays.equals(result, output));
    }

}
