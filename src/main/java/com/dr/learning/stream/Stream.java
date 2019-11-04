package com.dr.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Demo（有一链表，{1,2,3,4,5}，把偶数过滤掉）
public class Stream {
    public static void main(String[] args) throws InterruptedException {
        //getDistinctValue();
        //sorted();
        map();
        //reduce();
        //collect();
    }
    
    public static void sorted() {
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);
        list.stream().sorted().forEach(System.out::println);
    }
    public static void sortedDesc() {
        List list = new ArrayList();  
        list.add(2);  
        list.add(3);  
        list.add(1);  
        list.add(5);  
        list.add(4);  
//      list.stream().sorted().forEach(System.out::println);  
        list.stream().sorted( (param1,param2) -> ((int)param1 < (int)param2 ? 1 : -1 ) )  
                .forEach(System.out::println);  
    }
    
    public static void removeEvenNumber() {
        List list = new ArrayList();
        for (int i = 1; i <= 5; ++i) {
            list.add(i);
        }
        list.stream().filter(param -> (int) param % 2 == 1)
                .forEach(System.out::println);
    }
    
    public static void map() {
        List list = new ArrayList();  
        list.add(1);  
        list.add(0);  
        list.stream().map( param -> (int)param == 1 ? true:false )  
                .forEach(System.out::println);
        
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
    
    public static void getDistinctValue() {
        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(0);
        list.stream().distinct().forEach(System.out::println);
    }
    
    public static void reduce() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.stream().reduce((param1, param2) -> (int) param1 + (int) param2).get());
    }
    
    
    public static void collect() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //返回一个新的集合，这里是一个偶数集合
        List _list = (List) list.stream().filter((param) -> (int) param % 2 == 0).collect(Collectors.toList());
        _list.forEach(System.out::println);
        //返回一个新的集合，这里是一个奇数集合
        System.out.println("---------------");
        List _list1 = (List) list.stream().filter(
                (param) -> (int) param % 2 != 0).collect(Collectors.toList());
        _list1.forEach(System.out::println);
    }
    
    
    public static void minAndMax() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.stream().min((param1, param2) -> (int) param1 > (int) param2 ? 1 : -1).get());
        System.out.println(list.stream().max((param1, param2) -> (int) param1 > (int) param2 ? 1 : -1).get());
    }
    
}