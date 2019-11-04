package com.dr.exam.openinghospital;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        int nodes = 7;

        List<Integer> cityFrom = Arrays.asList(1,3,1,3,2,1);

        List<Integer> cityTo = Arrays.asList(2,6,4,7,5,3);

        int hospital = Result.hosital(7,cityFrom,cityTo);
        System.out.println(hospital);

       int nodes2 = 12;

        List<Integer> cityFrom2 = Arrays.asList(1,1,6,1,1,2,11,12,4,12,6);

        List<Integer> cityTo2 = Arrays.asList(11,2,7,6,12,3,10,9,5,8,4);

        int hospital1 = Result.hosital(nodes2,cityFrom2,cityTo2);
        System.out.println(hospital1);

        int nodes3 = 4;

        List<Integer> cityFrom3 = Arrays.asList(1,3);

        List<Integer> cityTo3 = Arrays.asList(2,4);

        int hospital3 = Result.hosital(nodes3,cityFrom3,cityTo3);
        System.out.println(hospital3);

        int nodes4 = 4;

        List<Integer> cityFrom4 = Arrays.asList(1,2,1);

        List<Integer> cityTo4 = Arrays.asList(2,3,4);

        int hospital4 = Result.hosital(nodes4,cityFrom4,cityTo4);
        System.out.println(hospital4);

        int nodes5 = 5;

        List<Integer> cityFrom5 = Arrays.asList(1,2,2,2);

        List<Integer> cityTo5 = Arrays.asList(2,3,4,5);

        int hospital5 = Result.hosital(nodes5,cityFrom5,cityTo5);
        System.out.println(hospital5);

        int nodes6 = 5;

        List<Integer> cityFrom6 = Arrays.asList(1,2,3,4,5);

        List<Integer> cityTo6 = Arrays.asList(2,3,4,5,1);

        int hospital6 = Result.hosital(nodes6,cityFrom6,cityTo6);
        System.out.println(hospital6);


    }
}
