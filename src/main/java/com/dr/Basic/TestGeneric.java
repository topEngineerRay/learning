package com.dr.Basic;

import java.util.HashMap;
import java.util.Map;

public class TestGeneric {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String, String>();
        map.put("hello","你好");
        map.put("hi","初次见面");
        System.out.println(map.get("hello"));
        System.out.println(map.get("hi"));
    }
}
