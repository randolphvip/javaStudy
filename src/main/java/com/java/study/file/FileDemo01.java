package com.java.study.file;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        System.out.println(file.getAbsolutePath());
        if(!file.exists()){
            //   file.mkdirs();

           file.createNewFile();
        }

        System.out.println(file);
    }
}
