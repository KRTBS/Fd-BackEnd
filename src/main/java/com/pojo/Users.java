package com.pojo;

public class Users {
    private int userID;
    private String userName;
    private String userPassword;
    private String address;
    private String userPhoneNumber;
    private String userRole;
    private String email;

    public Users() {
    }

    public Users(int userID, String userName, String userPassword, String address, String userPhoneNumber, String userRole, String email) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.address = address;
        this.userPhoneNumber = userPhoneNumber;
        this.userRole = userRole;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", address='" + address + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userRole='" + userRole + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
