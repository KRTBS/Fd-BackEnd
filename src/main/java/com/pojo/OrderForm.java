package com.pojo;

public class OrderForm {

    private int id;
    private String orderID;
    private int userID;
    private String orderForm;
    private String tradingStatus;
    private String time;

    public OrderForm() {
    }

    public OrderForm(String orderID, int userID, String orderForm, String tradingStatus, String time) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderForm = orderForm;
        this.tradingStatus = tradingStatus;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getOrderForm() {
        return orderForm;
    }

    public void setOrderForm(String orderForm) {
        this.orderForm = orderForm;
    }

    public String getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(String tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "id=" + id +
                ", orderID='" + orderID + '\'' +
                ", userID=" + userID +
                ", orderForm='" + orderForm + '\'' +
                ", tradingStatus='" + tradingStatus + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public OrderForm TradingStatus_UNDONE() {
        this.tradingStatus = "UNDONE";
        return this;
    }

    public OrderForm TradingStatus_DONE() {
        this.tradingStatus = "DONE";
        return this;
    }
}
