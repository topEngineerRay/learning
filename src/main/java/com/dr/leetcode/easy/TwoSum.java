package com.dr.leetcode.easy;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*
        Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:
        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].

         */
        //control the times of loop
        //1+2+3...+n-1
         //={};
        int[] b = {};//3
        for(int i=0;i<nums.length;i++){
            int currentNumber1 = nums[i];
            for(int j=i+1;j<nums.length;j++){
                //1
                int currentNumber2 = nums[j];
                int sum =currentNumber1+currentNumber2;
                if(sum==target){
                    int[] a = {i,j};
                    //2
                    return a;
                }
            }
        }
        return b;
    }
    
}