package com.dr.learning.rex;

import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        /*String str = "12\\33\\23\\1\\33\\22\\5\\3\\23\\23\\23\\23+16";
        String[] strs = str.split("[^\\d]+");
        for(String s : strs){
            System.out.println(s);
        }
        */
        String q = "(12231) or (122)";

        String q1 = "(12231)";

        String q2 = " 12231 or 122";
        String regex = "()d+";
        String regex1 = "[()]+";
        String regex2 = "(\\([^\\)]+\\))";
        String regex3 = "[\\(\\)]+";
        String[] qstrs = q.split(regex1);
      /*  for(String s : qstrs){
            System.out.println(s);
        }
        String[] qstrs1 = q1.split(regex1);
        for(String s : qstrs1){
            System.out.println(s);
        }
        String[] qstrs2 = q2.split(regex1);
        for(String s : qstrs2){
            System.out.println(s);
        }*/
        
        //removeZero();
        isDigit("122112");
        isDigit("s12211");
        isDigit("212@@1");
        isDigit("2112 22");
    }
    private static void removeZero(){
        String s="000@!0!@@124004000";
        System.out.println(s.replaceAll("^[0]+", ""));
        
    }
    
    private static void isDigit(String strNum) {  
        boolean b = strNum.matches("[0-9]{1,}");  
        System.out.println(b);
    } 
}
