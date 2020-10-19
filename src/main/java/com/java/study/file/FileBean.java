package com.java.study.file;

public class FileBean {
    public FileBean(String MD5, String fileName) {
        this.MD5 = MD5;
        this.fileName = fileName;
    }

    private String MD5;
    private String fileName;

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
