package com.java.study.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
     Map<String ,String> map=   new HashMap();
     map.put("dd","tt");
     map.containsKey("dd");
     if(map.containsKey("dd")){
         System.out.println("----");
     }
    }
}
