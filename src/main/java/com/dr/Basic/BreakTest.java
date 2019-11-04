package com.dr.Basic;

public class BreakTest {
    public static void main(String[] args) {

        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                break; //如果是双数，直接结束循环

            System.out.println(j);
        }
    }
}