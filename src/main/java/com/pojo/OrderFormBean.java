package com.pojo;

public class OrderFormBean {

    private int itemID;
    private String itemName;
    private float itemPrice;
    private String itemSelection;
    private int itemNum;
    private float subtotal;

    public OrderFormBean() {
    }

    public OrderFormBean(int itemID, String itemName, float itemPrice, String itemSelection, int itemNum, float subtotal) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemSelection = itemSelection;
        this.itemNum = itemNum;
        this.subtotal = subtotal;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemSelection() {
        return itemSelection;
    }

    public void setItemSelection(String itemSelection) {
        this.itemSelection = itemSelection;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "OrderFormBean{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemSelection='" + itemSelection + '\'' +
                ", itemNum=" + itemNum +
                ", subtotal=" + subtotal +
                '}';
    }
}
