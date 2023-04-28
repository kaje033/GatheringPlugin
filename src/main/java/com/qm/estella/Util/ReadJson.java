package com.qm.estella.Util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class ReadJson {
    public static Boolean Check(Object arg,Object arg1) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Reader reader = new InputStreamReader(new FileInputStream("plugins/estella/estella.json"),"utf-8");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        JSONArray CodeName = (JSONArray) jsonObject.get("CodeName");

        Boolean code = false;
        if (CodeName.size() > 0) {
            for (int i = 0; i < CodeName.size(); i++) {
                JSONObject obj = (JSONObject) CodeName.get(i);

                if(obj.get("code").equals(arg)){
                    code = true;
                }
            }
        }

        Boolean name = false;
        if (CodeName.size() > 0) {
            for (int i = 0; i < CodeName.size(); i++) {
                JSONObject obj1 = (JSONObject) CodeName.get(i);

                if(obj1.get("name").equals(arg1)){
                    name = true;
                }
            }
        }

        Boolean result = false;
        if(code && name){
            result = true;
        }

        return result;
    }

    public static boolean Connect(Object uuid) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Reader reader = new InputStreamReader(new FileInputStream("plugins/estella/player/"+uuid+".json"),"utf-8");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        Boolean result = (Boolean) jsonObject.get("connect");

        return result;
    }

    public static int Data(Object uuid) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Reader reader = new InputStreamReader(new FileInputStream("plugins/estella/player/"+uuid+".json"),"utf-8");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        int result = ((Long) jsonObject.get("point")).intValue();

        return result;
    }

    public static int Data2(Object uuid) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Reader reader = new InputStreamReader(new FileInputStream("plugins/estella/player/"+uuid+".json"),"utf-8");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        int result = ((Long) jsonObject.get("fatigue")).intValue();

        return result;
    }

    public static Long fati(Object filename) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Reader reader = new InputStreamReader(new FileInputStream("plugins/estella/player/"+filename),"utf-8");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        Long result = (Long) jsonObject.get("point");

        return result;
    }

    public static Boolean fati2(Object filename) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Reader reader = new InputStreamReader(new FileInputStream("plugins/estella/player/"+filename),"utf-8");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        Boolean result = (Boolean) jsonObject.get("connect");

        return result;
    }
}
