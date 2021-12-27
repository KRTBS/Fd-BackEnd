package com.pojo;

public class Shop {
    private int ShopID;
    private String ShopName;
    private float ShopScore;
    private float StartingPrice;
    private float Freight;
    private String Describe;
    private int ShopLocation;
    private int OwnerID;

    public Shop() {
    }

    public Shop(String shopName, float shopScore, float startingPrice, float freight, String describe, int shopLocation, int ownerID) {
        ShopName = shopName;
        ShopScore = shopScore;
        StartingPrice = startingPrice;
        Freight = freight;
        Describe = describe;
        ShopLocation = shopLocation;
        OwnerID = ownerID;
    }

    public Shop(int shopID, String shopName, float shopScore, float startingPrice, float freight, String describe, int shopLocation, int ownerID) {
        ShopID = shopID;
        ShopName = shopName;
        ShopScore = shopScore;
        StartingPrice = startingPrice;
        Freight = freight;
        Describe = describe;
        ShopLocation = shopLocation;
        OwnerID = ownerID;
    }

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public float getShopScore() {
        return ShopScore;
    }

    public void setShopScore(float shopScore) {
        ShopScore = shopScore;
    }

    public float getStartingPrice() {
        return StartingPrice;
    }

    public void setStartingPrice(float startingPrice) {
        StartingPrice = startingPrice;
    }

    public float getFreight() {
        return Freight;
    }

    public void setFreight(float freight) {
        Freight = freight;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public int getShopLocation() {
        return ShopLocation;
    }

    public void setShopLocation(int shopLocation) {
        ShopLocation = shopLocation;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(int ownerID) {
        OwnerID = ownerID;
    }
}
