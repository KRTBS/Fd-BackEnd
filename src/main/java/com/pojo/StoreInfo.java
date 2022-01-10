package com.pojo;

public class StoreInfo {

    private int id;

    private String imgsrc;

    private String briefinfo;

    private String address;

    private String telephone;

    private String businesshours;

    private String offdays;

    private String googlemapsrc;

    public StoreInfo() {
    }

    public StoreInfo(String imgsrc, String briefinfo, String address, String telephone, String businesshours, String offdays, String googlemapsrc) {
        this.imgsrc = imgsrc;
        this.briefinfo = briefinfo;
        this.address = address;
        this.telephone = telephone;
        this.businesshours = businesshours;
        this.offdays = offdays;
        this.googlemapsrc = googlemapsrc;
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

    public String getBriefinfo() {
        return briefinfo;
    }

    public void setBriefinfo(String briefinfo) {
        this.briefinfo = briefinfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBusinesshours() {
        return businesshours;
    }

    public void setBusinesshours(String businesshours) {
        this.businesshours = businesshours;
    }

    public String getOffdays() {
        return offdays;
    }

    public void setOffdays(String offdays) {
        this.offdays = offdays;
    }

    public String getGooglemapsrc() {
        return googlemapsrc;
    }

    public void setGooglemapsrc(String googlemapsrc) {
        this.googlemapsrc = googlemapsrc;
    }
}
