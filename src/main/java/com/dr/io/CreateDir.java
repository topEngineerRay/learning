package com.dr.io;

import java.io.File;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
        /*
        编译并执行上面代码来创建目录 "/tmp/user/java/bin"。
注意： Java 在 UNIX 和 Windows 自动按约定分辨文件路径分隔符。
如果你在 Windows 版本的 Java 中使用分隔符 (/) ，路径依然能够被正确解析。
         */
    }
}
