package com.dr.learning;

import java.util.HashMap;
import java.util.Map;

public class StringSize {
    public static void main(String[] args){
        Map<String,String> postgresMd5Result = new HashMap<>();
        for(int i = 0; i<3000000;i++){
            postgresMd5Result.put("1234567"+i,"1234567"+i);
        }
    }
}
