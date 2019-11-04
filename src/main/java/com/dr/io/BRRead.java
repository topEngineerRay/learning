package com.dr.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用 BufferedReader 在控制台读取字符
public class BRRead {
    //int read( ) throws IOException
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下‘q’退出");
        //读取字符
        do {
            c = (char) br.read();
        } while (c != 'q');
    }
}
