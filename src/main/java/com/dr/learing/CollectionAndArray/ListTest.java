package com.dr.learing.CollectionAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.prefs.Preferences;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a1", "ab2", "a3", "ab4", "a5", "ab6", "a7", "ab8", "a9"));
        // 迭代删除方式一：报错 java.util.ConcurrentModificationException
        /*for (String str : list) {
            System.out.println(str);
            if (str.contains("b")) {
                list.remove(str);
            }
        }*/

        // 迭代删除方式二
        /*
            报错：下标越界 java.lang.IndexOutOfBoundsException

　　　　    list移除了元素但size大小未响应变化,所以导致数组下标不对；
　　　　    list.remove(i)必须size--

　　　　    而且取出的数据的索引也不准确，同时需要做i--操作
         */
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println(str);
            if (str.contains("b")) {
                list.remove(i);
                //                size--;
                //                 i--;
            }
        }
        List<String> list1 = new ArrayList<String>();

        // 迭代删除方式三:正常删除，不推荐；每次循环都需要计算list的大小，效率低
        /*for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
            if (str.contains("b")) {
                list.remove(i);
            }
        }*/

        // 迭代删除方式四:正常删除，推荐使用
        /*for (Iterator<String> ite = list.iterator(); ite.hasNext(); ) {
            String str = ite.next();
            System.out.println(str);
            if (str.contains("b")) {
                ite.remove();
            }
        }*/

        // 迭代删除方式五:报错- java.util.ConcurrentModificationException
        /*for (Iterator<String> ite = list.iterator(); ite.hasNext(); ) {
            String str = ite.next();
            if (str.contains("b")) {
                list.remove(str);
            }
        }*/
    }
}