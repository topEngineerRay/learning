package com.dr.learing.javaBasic;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class VMExceptions {
    public static void main(String[] args){
        //stackOverFlow();
        heapOutOfMemory();
    }
    private static void stackOverFlow(){
        addN(10);
    }

    private static int addN(int n){
        return n+addN(n-1);
        //stack overflow
    }
    private static void heapOutOfMemory(){
        //堆溢出 情况多见于对象过多，存在多余引用，使对象未及时释放
        ArrayList<String> strs = new ArrayList<>(10000_0000);
        for(int i = 0 ;i <= 10000_0000; ++ i){
            strs.add(Integer.toString(i));
            if(i % 10000 == 0){
                System.out.println(i);
            }
        }
    }

    private static void DirectMemoryOutOfMemory(int n){
        //堆外内存溢出 一般与nio有关
        List<ByteBuffer> buffers = new ArrayList<>();
        while(true){
            ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024 * 1024);
            buffers.add(buffer);
        }
    }

    private static void StackOutOfMemory(int n){
        //栈溢出 一般与方法递归次数过多或者方法中有产生大量数据的循环有
        miao();
    }
    public static void miao(){
        long time = System.currentTimeMillis();
        miao();
    }
    //不提示需要返回值，是否是一个bug?
    private static int isThisABug(int n){
        while(true){
            int a[] = new int[100000000];
        }
    }
}
