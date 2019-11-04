package com.dr.learing.CollectionAndArray;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CurrentHashMapTest {
    public static void main(String[] args){
        Map map = new ConcurrentHashMap();
        map.put("1","2");
        System.out.println(map.get("1"));
        map.put("1","3");
    }
}
