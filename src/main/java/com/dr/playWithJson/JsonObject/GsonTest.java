package com.dr.playWithJson.JsonObject;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Map;

public class GsonTest {
    public static void main(String[] args){
      /*  String json = FileUtils.readFileByLines("json/metadata.json");
        JSONObject obj = JSONObject.fromObject(json);
        System.out.println(obj.entrySet());
        System.out.println(obj.keySet());
        System.out.println(obj.isArray());

        System.out.println(obj.size());
        System.out.println(obj.names());
        System.out.println(obj.values());

        JSONArray entities = obj.getJSONArray("Entities");
        checkAndReplace(entities);*/

        /*for(int i =0;i<entities.size();i++){
            JSONObject jsonObject = (JSONObject) entities.get(i);
             if(jsonObject.get("sap:label")!=null){
                 replaceValueWithTheValueIni18n( jsonObject.get("sap:label").toString() ,jsonObject );
             }
            if(jsonObject.get("Properties")!=null){
                JSONArray properties = (JSONArray) jsonObject.get("Properties");
                for(Object jsonObject1 : properties){

                }
                for(int j =0;j<properties.size();j++){
                    JSONObject jsonObject1 = (JSONObject) properties.get(j);

                }
                replaceValueWithTheValueIni18n( jsonObject.get("sap:label").toString() ,jsonObject );
            }

        }*/

        //test1();
    }
    public static void checkAndReplace(JSONArray jsonArray){
        for(int i =0;i<jsonArray.size();i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            if (jsonObject.get("sap:label") != null) {
                replaceValueWithTheValueIni18n(jsonObject.get("sap:label").toString(), jsonObject);
            }

            if(jsonObject.get("Properties")!=null){
                JSONArray properties = (JSONArray) jsonObject.get("Properties");
                checkAndReplace(properties);
            }
        }
    }

    private static void replaceValueWithTheValueIni18n(String key, JSONObject jsonObject) {
        //get the relevant language-dependent text
        jsonObject.put("sap:label","test");
    }

    public static void test(){
        JSONObject json1=JSONObject.fromObject("{'username' : '11111','clientid' : '','password' : '222222'}");
        Map<String, Object> map =json1;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
    public static void test1(){
        String jsonString = "{\"UserName\":\"ZHULI\",\"age\":\"30\",\"workIn\":\"ALI\",\"Array\":[\"ZHULI\",\"30\",\"ALI\"]}";
        JSONObject obj = JSONObject.fromObject(jsonString);
        if (obj.has("UserName")) {
            System.out.println("UserName:" + obj.getString("UserName"));
        }
        if (obj.has("Array")) {
            JSONArray transitListArray = obj.getJSONArray("Array");
            for (int i = 0; i < transitListArray.size(); i++) {
                System.out.println("Array:" + transitListArray.getString(i) + " ");

            }
        }

    }
}
