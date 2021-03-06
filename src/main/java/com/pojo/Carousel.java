package com.pojo;

public class Carousel {
    private int id;
    private String title;
    private String imgsrc;
    private int itemid;

    public Carousel() {
    }

    public Carousel(String title, String imgsrc, int itemid) {
        this.title = title;
        this.imgsrc = imgsrc;
        this.itemid = itemid;
    }

    public int getId() {
        return id;
    }

    //public void setId(int id) {
    //    this.id = id;
    //}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }
}
