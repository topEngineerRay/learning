package com.dr.io;

import java.io.*;

//程序首先创建文件test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。
//由于是二进制写入，可能存在乱码
public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println(is.read() + " ");
            }

            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
