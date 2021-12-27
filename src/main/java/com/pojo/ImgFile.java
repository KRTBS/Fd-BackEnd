package com.pojo;

public class ImgFile {
    private int id;
    private String fileName;

    public ImgFile() {
    }

    public ImgFile(String fileName) {
        this.fileName = fileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
