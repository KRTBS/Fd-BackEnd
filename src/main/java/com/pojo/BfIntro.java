package com.pojo;

public class BfIntro {

    private int id;
    private String imgsrc;
    private String title;
    private String content;

    public BfIntro() {
    }

    public BfIntro(String imgsrc, String title, String content) {
        this.imgsrc = imgsrc;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
