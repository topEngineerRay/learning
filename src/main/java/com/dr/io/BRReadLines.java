package com.dr.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

////使用 BufferedReader 在控制台读取字符
public class BRReadLines {
    //String readLine( ) throws IOException
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
