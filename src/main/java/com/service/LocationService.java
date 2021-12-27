package com.service;

import com.pojo.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {

    List<Location> queryAllLocation();

    Location queryLoactionByID(int LocationID);

    int addNewLoaction(Location location);

    int deleteLocationByID(int LocationID);

    int updataLocation(Location location);

}
