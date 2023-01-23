package com.main.leetcode.q013roman2integer;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

    public static int romanInteger(String s) {

        int result = 0;
        int prev = 0;
        int current = 0;

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {

            current = map.get(s.charAt(i));

            if (prev < current) {
                result -= prev;
            } else {
                result += prev;
            }

            prev = current;

        }

        return result + current;

    }

}
