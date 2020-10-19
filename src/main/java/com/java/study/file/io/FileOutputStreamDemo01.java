package com.java.study.file.io;

import java.io.*;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("IoDemo01.txt");
        OutputStream fos= new FileOutputStream(file);
        fos.write("123".getBytes());

        fos.close();
    }
}
