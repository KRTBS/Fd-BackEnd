package com.pojo;

public class Location {
    private int LocationID;
    private String LocationName;

    public Location() {
    }

    public Location(String locationName) {
        LocationName = locationName;
    }

    public Location(int locationID, String locationName) {
        LocationID = locationID;
        LocationName = locationName;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int locationID) {
        LocationID = locationID;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    @Override
    public String toString() {
        return "Location{" +
                "LocationID=" + LocationID +
                ", LocationName='" + LocationName + '\'' +
                '}';
    }
}
