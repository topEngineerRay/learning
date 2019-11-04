package com.dr.Basic;

import java.util.Date;

public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        //stringTest.testStringMemory();
        //stringTest.testStartWith();

        /*
        testStringAdd();
        testStringConcat();
        testStringBuilder();
        */

//             stringTest.testStringMemory1();
        //  stringTest.testStringMemory2();
        //        stringTest.testStringMemory3();

        stringTest.testStringIntern();
    }

    public void testStringMemory() {
        String s1 = "1";
        String s2 = "1";

        String s3 = new String("1");
        String s4 = new String("1");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        System.out.println(s3 == s4);
        System.out.println(s1 == s3);

    }

    private void testStringIndex() {
        String s = "abcdefabc";
        System.out.println(s.indexOf("b"));
    }
    private void testStartWith(){
        String s = "abcdefabc";
        s.startsWith("a");
    }
    private void testStringIntern(){
        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = new String("ab");

        System.out.println(str5.equals(str3));
        System.out.println(str5 == str3);
        System.out.println(str5.intern() == str3);
        System.out.println(str5.intern() == str4);
    }

    public static void testStringAdd() {
        long starTime = new Date().getTime();
        String string = new String();
        for (int i = 0; i < 50000; i++) {
            string = string + i;
        }
        long endTime = new Date().getTime();
        System.out.println("“+”号花费时间:" + (endTime - starTime));
    }

    public static void testStringConcat() {
        long starTime = new Date().getTime();
        String string = new String();
        for (int i = 0; i < 50000; i++) {
            string = string.concat(String.valueOf(i));
        }
        long endTime = new Date().getTime();
        System.out.println("concat花费时间:" + (endTime - starTime));
    }

    public static void testStringBuilder() {

        String s = "123";
        System.out.println(s.substring(1));

        /*long starTime = new Date().getTime();
        String string = new String();
        StringBuilder stringb = new StringBuilder();
        for(int i=0;i<50000;i++){
            stringb = stringb.append(i);
        }
        string = string + stringb;
        long endTime = new Date().getTime();
        System.out.println("StringBuilder花费时间:"+(endTime - starTime));*/
    }

    public void testStringMemory1() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s4);//false
        System.out.println(s1 == s9);//false
        System.out.println(s4 == s5);//false
        System.out.println(s1 == s6);//true
    }

    public void testStringMemory2() {
        /*
        　在jdk1.6下运行的结果为：

　　      false,false

　　      在jdk1.7,1.8下运行的结果为：

　　      false,true
         */
        String s1 = new String("hello");
        String intern1 = s1.intern();
        String s2 = "hello";
        System.out.println(s1 == s2);
        String s3 = new String("hello") + new String("hello");
        String intern3 = s3.intern();
        String s4 = "hellohello";
        System.out.println(s3 == s4);
    }

    public void testStringMemory3() {
        String s1 = new String("hello");
        String s2 = "hello";
        String intern1 = s1.intern();
        System.out.println(s1 == s2);
        String s3 = new String("hello") + new String("hello");
        String s4 = "hellohello";
        String intern3 = s3.intern();
        System.out.println(s3 == s4);
    }
}
