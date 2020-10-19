package com.java.study.file.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesDemo02 {

    public static void main(String[] args) throws IOException {

        myStore();
        load();
    }

    private static void load() throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("a.properties"));
        for (Object key: pro.keySet()){
            System.out.println(key +"   "+pro.get(key));
        }


    }

    private static void myStore() throws IOException {
        Properties pro = new Properties();

        HashMap<String, String> map = new HashMap<>();
        map.put("userName", "root");
        map.put("password", "123456");
        map.put("URL", "localhost");
        pro.putAll(map);
        pro.setProperty("drive", "mysql");
        pro.put("name", "a");
        FileWriter fw = new FileWriter("a.properties");
        pro.store(fw, null);
        fw.close();
    }

}
