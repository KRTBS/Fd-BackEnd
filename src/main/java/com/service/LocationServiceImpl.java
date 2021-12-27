package com.service;

import com.dao.LocationMapper;
import com.pojo.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationMapper locationMapper;

    public void setLocationMapper(LocationMapper locationMapper) {
        this.locationMapper = locationMapper;
    }

    @Override
    public List<Location> queryAllLocation() {

        List<Location> locations = locationMapper.queryAllLocation();

        return locations;
    }

    @Override
    public Location queryLoactionByID(int LocationID) {
        return locationMapper.queryLoactionByID(LocationID);
    }

    @Override
    public int addNewLoaction(Location location) {
        return locationMapper.addNewLoaction(location);
    }

    @Override
    public int deleteLocationByID(int LocationID) {
        return locationMapper.deleteLocationByID(LocationID);
    }

    @Override
    public int updataLocation(Location location) {
        return locationMapper.updataLocation(location);
    }
}
