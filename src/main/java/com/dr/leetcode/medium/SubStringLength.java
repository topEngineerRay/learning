package com.dr.leetcode.medium;

public class SubStringLength {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("ckilbkd"));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] chars=new char[s.length()];
        String s1 ="";
        String s2 ="";
        int length1 = 0;
        int length2 = 0;
        chars=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s1==""){
                s1=String.valueOf(chars[i]);
            }else if(s1.indexOf(chars[i])==-1){
                s1 = s1 + String.valueOf(chars[i]);
            }/*else{
                //break;
                s1 = String.valueOf(chars[i]);
                //length1 = s1.length;
            }*/
            for(int j=i+1;j<s.length();j++){
                if(s2==""){
                    s2=String.valueOf(chars[j]);
                }else if(s2.indexOf(chars[j])==-1){
                    s2 = s2 + String.valueOf(chars[j]);
                }/*else{
                     s2="";
                     //break;
                     //length2 = s1.length;
                 }*/
            }
        }
        if(s.contains(s1)&&s.contains(s2)){
            return s1.length()>s2.length()?s1.length():s2.length();
        }
        if(s.contains(s1)){
            return s1.length();
        }
        if(s.contains(s2)){
            return s2.length();
        }
        return 0;
        // return length1>s2.length()?s1.length():s2.length();
    }
    //solution 2 ,use hashset
}
