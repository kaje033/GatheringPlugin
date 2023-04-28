package com.qm.estella.Util;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJson {
    public static void jPut(Object uuid,Object point,Object fatigue){
        String path = "plugins/estella"; //폴더 경로
        File Folder = new File(path);

        // 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
        if (!Folder.exists()) {
            try{
                Folder.mkdir(); //폴더 생성합니다.
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
        String path1 = "plugins/estella/player"; //폴더 경로
        File Folder1 = new File(path1);

        // 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
        if (!Folder1.exists()) {
            try{
                Folder1.mkdir(); //폴더 생성합니다.
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }

        JSONObject obj = new JSONObject();

        obj.put("connect",true);
        obj.put("point",point);
//        obj.put("rank",rank);
        obj.put("fatigue",fatigue);

        try{
            FileWriter file = new FileWriter("plugins/estella/player/"+uuid+".json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void f(Object uuid){
        String path = "plugins/estella"; //폴더 경로
        File Folder = new File(path);

        // 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
        if (!Folder.exists()) {
            try{
                Folder.mkdir(); //폴더 생성합니다.
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
        String path1 = "plugins/estella/player"; //폴더 경로
        File Folder1 = new File(path1);

        // 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
        if (!Folder1.exists()) {
            try{
                Folder1.mkdir(); //폴더 생성합니다.
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }

        JSONObject obj = new JSONObject();

        obj.put("connect",false);
        obj.put("fatigue",0);
        obj.put("point",0);

        try{
            FileWriter file = new FileWriter("plugins/estella/player/"+uuid+".json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fatiPut(Object filename,Object point,Object conn,Object fatigue){
        String path = "plugins/estella"; //폴더 경로
        File Folder = new File(path);

        // 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
        if (!Folder.exists()) {
            try{
                Folder.mkdir(); //폴더 생성합니다.
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
        String path1 = "plugins/estella/player"; //폴더 경로
        File Folder1 = new File(path1);

        // 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
        if (!Folder1.exists()) {
            try{
                Folder1.mkdir(); //폴더 생성합니다.
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }

        JSONObject obj = new JSONObject();

        obj.put("connect",conn);
        obj.put("point",point);
//        obj.put("rank",rank);
        obj.put("fatigue",fatigue);

        try{
            FileWriter file = new FileWriter("plugins/estella/player/"+filename);
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
