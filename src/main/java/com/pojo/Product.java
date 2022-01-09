package com.pojo;

public class Product {

    private int id;
    private String name;
    private String imgsrc;
    private float price;
    private String briefinfo;
    private String fullinfo;

    public Product() {
    }

    public Product(String name, String imgsrc, float price, String briefinfo, String fullinfo) {
        this.name = name;
        this.imgsrc = imgsrc;
        this.price = price;
        this.briefinfo = briefinfo;
        this.fullinfo = fullinfo;
    }

    public int getId() {
        return id;
    }

    //public void setId(int id) {
    //    this.id = id;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBriefinfo() {
        return briefinfo;
    }

    public void setBriefinfo(String briefinfo) {
        this.briefinfo = briefinfo;
    }

    public String getFullinfo() {
        return fullinfo;
    }

    public void setFullinfo(String fullinfo) {
        this.fullinfo = fullinfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", price=" + price +
                ", briefinfo='" + briefinfo + '\'' +
                ", fullinfo='" + fullinfo + '\'' +
                '}';
    }
}
