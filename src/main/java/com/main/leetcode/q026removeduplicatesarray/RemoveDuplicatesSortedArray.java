package com.main.leetcode.q026removeduplicatesarray;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[i] < nums[j]) {
                nums[++i] = nums[j];
            }
        }

        return ++i;

    }

}
