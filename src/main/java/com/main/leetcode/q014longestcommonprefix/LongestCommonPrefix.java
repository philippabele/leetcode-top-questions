package com.main.leetcode.q014longestcommonprefix;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String lcp(String[] strs) {

        Arrays.sort(strs);

        if (strs.length == 1) {
            return strs[0];
        }

        int lcp = 0;

        while (lcp < strs[0].length() && lcp < strs[strs.length - 1].length()) {

            if (strs[0].charAt(lcp) == strs[strs.length - 1].charAt(lcp)) {
                lcp++;
            } else {
                break;
            }

        }

        return strs[0].substring(0, lcp);
    }

}
