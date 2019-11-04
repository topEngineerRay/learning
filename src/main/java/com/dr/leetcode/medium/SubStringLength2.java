package com.dr.leetcode.medium;

public class SubStringLength2 {
    /*
    Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

     */
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("nfpdmpi"));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars =s.toCharArray();
        String s1 = "";
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s1 == "") {
                s1 = String.valueOf(chars[i]);
                if (s1.length() > result)
                    result = s1.length();
            } else if (s1.indexOf(chars[i]) == -1) {
                s1 = s1 + String.valueOf(chars[i]);
                if (s1.length() > result)
                    result = s1.length();
            } else {
                //break;
                if (s1.length() > result) {
                    result = s1.length();
                }
                //pw w , pwa w
                if (s.indexOf(chars[i]) < s.length()) {
                    //s1 = s1.substring(s1)
                    //s1 = s1 + String.valueOf(chars[i]);
                    s1 = s1.substring(s1.indexOf(chars[i]) + 1, s1.length()) + chars[i];
                }
            }

        }
        return result;
    }
}
