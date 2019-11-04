package com.dr.playWithJson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        Resource resource = new ClassPathResource("/json/metadata.json");
     /*   try (InputStream inputStream = resource.getInputStream()) {
            Map<String, Object> metadata = new ObjectMapper().readValue(inputStream,
                    new TypeReference<Map<String, Object>>() {
                    });

        }*/


      /*  InputStream inputStream = resource.getInputStream();
        String s =  StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        System.out.println(s);

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("C:\\Users\\I333750\\workspace\\learning\\src\\main\\resources\\json\\metadata.json"));

        Object object = gson.fromJson(reader,Object.class);
        DppMetadata data = gson.fromJson(reader, DppMetadata.class);

        System.out.println(data);
        List arrayList = (List) data.getEntities();
        for(int i=0;i<arrayList.size();i++){

            if(arrayList.get(i).toString()=="sap:label"){

            }
        }*/
      //A();
      B();

    }
    private static void A() throws Exception{
        Resource resource = new ClassPathResource("/json/metadata.json");
     /*   try (InputStream inputStream = resource.getInputStream()) {
            Map<String, Object> metadata = new ObjectMapper().readValue(inputStream,
                    new TypeReference<Map<String, Object>>() {
                    });

        }*/


        InputStream inputStream = resource.getInputStream();
        String s =  StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        JSONObject employeeDetails2 = new JSONObject();

        JSONParser jsonParser = new JSONParser();
        JSONObject obj = (JSONObject) jsonParser.parse(s);
        JSONObject obj1 = (JSONObject) obj.get("Entities");
        //JSONArray employeeList = (JSONArray) obj;
        //JSONArray json = JSONArray.fromObject(str );
        System.out.println(obj);
    }

    private static void B() throws Exception{
        Resource resource = new ClassPathResource("/json/metadata.json");
        InputStream inputStream = resource.getInputStream();
        String s =  StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        JsonObject returnData = new JsonParser().parse(s).getAsJsonObject();
        JsonArray entities = returnData.get("Entities").getAsJsonArray();
        JsonObject metadata = entities.get(0).getAsJsonObject();
        //String Entities_label = metadata.get("sap:label").toString();
        JsonArray properties = metadata.get("Properties").getAsJsonArray();
        int size = properties.size();

        for(int i = 0;i<size;i++){
            JsonObject jsonObject = properties.get(i).getAsJsonObject();
            if(null!=jsonObject.get("sap:label")){
                String originLabel = jsonObject.get("sap:label").toString();
                System.out.println(originLabel);
            }
        }

        //String Entities_label = metadata.get("sap:label").toString();
    }
}
