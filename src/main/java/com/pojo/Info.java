package com.pojo;

public class Info {

    private int id;
    private String title;
    private String time;
    private String content;
    private String imgsrc;

    public Info() {
    }

    public Info(String title, String time, String content, String imgsrc) {
        this.title = title;
        this.time = time;
        this.content = content;
        this.imgsrc = imgsrc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }
}
