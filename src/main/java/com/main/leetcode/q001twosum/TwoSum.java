package com.main.leetcode.q001twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // public static void main(String[] args) {
    // int[] nums = new int[] { 2, 7, 11, 15 };
    // int target = 9;

    // int[] output = new int[] { 0, 1 };
    // // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    // int[] result = twoSum(nums, target);

    // }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // check constraints
            if (2 > nums.length)
                return null;
            if (nums.length > 104)
                return null;

            if (-109 > nums[i])
                return null;
            if (nums[i] > 109)
                return null;
            if (-109 > target)
                return null;
            if (target > 109)
                return null;

            // determine gap
            int gap = target - nums[i];

            // look up with O(1) for a HashMap, return if found
            if (map.containsKey(gap)) {
                return new int[] { map.get(gap), i };
            }

            // add to map
            map.put(nums[i], i);

        }

        // no solution found
        return null;

    }
}