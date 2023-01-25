package com.main.leetcode.q020validparantheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

    public static boolean validPara(String s) {

        if (s.length() == 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char chari = s.charAt(i);

            if (map.containsValue(chari)) {
                stack.push(chari);
            } else if (map.containsKey(chari) && !stack.isEmpty()) {
                if (stack.pop() != map.get(chari)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
