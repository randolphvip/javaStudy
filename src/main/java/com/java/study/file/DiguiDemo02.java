package com.java.study.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class DiguiDemo02 {
    static java.util.Map<String,String> map= new HashMap();
    
    
    public static void main(String[] args) {
        File srcFile = new File("H:\\photo");
        gtAllFilePath(srcFile);

    }

    public static void gtAllFilePath(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    gtAllFilePath(file);
                } else {
                    String MD5=MD5Utils.getMD5One(file.getAbsolutePath());
                    if(map.containsKey(MD5)){
                        System.out.println(map.get(MD5) +"   "+file.getAbsolutePath());
                    }else{
                        map.put(MD5,file.getAbsolutePath());

                    }

                }
            }

        }
    }


}
