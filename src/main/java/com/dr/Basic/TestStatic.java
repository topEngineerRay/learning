package com.dr.Basic;

import com.dr.exam.Test;

public class TestStatic {
    public static final int main(String[] args){
        System.out.println("1");
            return 1;
    }

    private void testB(){
        TestStatic.test();
    }

    private static void test(){
        System.out.println("12");
    }

}
