package com.dr.Basic;

public class ContinueTest {
    public static void main(String[] args) {

        test1();
    }

    private static void test1() {

        //打印单数
        for (int j = 0; j < 10; j++) {
            if (0 == j % 2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环

            System.out.println(j);
        }
    }

    private static void test2() {

        StringBuffer searchstr = new StringBuffer("hello how are you. ");
        int length = searchstr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchstr.charAt(i) != 'h') {
                continue;
            }
            count++;
            searchstr.setCharAt(i, 'h');
        }
        System.out.println("发现 " + count
                + " 个 h 字符");
        System.out.println(searchstr);
    }
}
