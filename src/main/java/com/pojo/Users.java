package com.pojo;

public class Users {
    private int UserID;
    private String UserName;
    private String UserPassword;
    private int UserLocation;
    private String UserPhoneNumber;
    private String UserRole;

    public Users() {
    }

    public Users(int userID, String userName, String userPassword, int userLocation, String userPhoneNumber, String userRole) {
        UserID = userID;
        UserName = userName;
        UserPassword = userPassword;
        UserLocation = userLocation;
        UserPhoneNumber = userPhoneNumber;
        UserRole = userRole;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public int getUserLocation() {
        return UserLocation;
    }

    public void setUserLocation(int userLocation) {
        UserLocation = userLocation;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }

    public String getUserRole() {
        return UserRole;
    }

    public void setUserRole(String userRole) {
        UserRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserLocation=" + UserLocation +
                ", UserPhoneNumber='" + UserPhoneNumber + '\'' +
                ", UserRole='" + UserRole + '\'' +
                '}';
    }
}
