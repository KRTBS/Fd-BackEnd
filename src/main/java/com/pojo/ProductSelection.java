package com.pojo;

public class ProductSelection {

    private int id;
    private String select;
    private int itemid;

    public ProductSelection() {
    }

    public ProductSelection(String select, int itemid) {
        this.select = select;
        this.itemid = itemid;
    }

    public int getId() {
        return id;
    }

    //public void setId(int id) {
    //    this.id = id;
    //}

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }
}
