package com.pojo;

public class ProductImg {
    private int id;
    private String imgsrc;
    private int itemid;

    public ProductImg() {
    }

    public ProductImg(String imgsrc, int itemid) {
        this.imgsrc = imgsrc;
        this.itemid = itemid;
    }

    public int getId() {
        return id;
    }

    //public void setId(int id) {
    //    this.id = id;
    //}

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
