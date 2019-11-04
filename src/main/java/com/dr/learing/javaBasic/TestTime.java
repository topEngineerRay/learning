package com.dr.learing.javaBasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
    public static void main(String[] args){
        try {
            testTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void testTime() throws ParseException {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'测试'HH:mm:ss.SSSZ");
        String str = df.format(date);
        String str1 = df1.format(date);
        System.out.println(str);
        System.out.println(str1);
    }
}
