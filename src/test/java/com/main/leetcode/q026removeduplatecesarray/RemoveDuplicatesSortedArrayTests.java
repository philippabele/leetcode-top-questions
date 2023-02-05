package com.main.leetcode.q026removeduplatecesarray;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.main.leetcode.q026removeduplicatesarray.RemoveDuplicatesSortedArray;

public class RemoveDuplicatesSortedArrayTests {

    @Test
    public void exampleOne() {

        int[] nums = new int[] { 1, 1, 2 };
        int solu = 2;

        int resu = RemoveDuplicatesSortedArray.removeDuplicates(nums);

        assertTrue(solu == resu);

    }

    @Test
    public void exampleTwo() {

        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int solu = 5;

        int resu = RemoveDuplicatesSortedArray.removeDuplicates(nums);

        assertTrue(solu == resu);

    }

}
