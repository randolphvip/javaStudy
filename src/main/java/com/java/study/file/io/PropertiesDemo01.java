package com.java.study.file.io;

import java.util.HashMap;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        HashMap<String, String> map = new HashMap<>();
        map.put("userName","root");
        map.put("password","123456");
        map.put("URL","localhost");
        pro.putAll(map);
        pro.setProperty("drive","mysql");
        pro.put("name","a");
        for (Object key: pro.keySet()){
            System.out.println(key +"   "+pro.get(key));
        }
    }
}
