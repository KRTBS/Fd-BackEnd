package com.dao;

import com.pojo.Location;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationMapper {

    List<Location> queryAllLocation();

    Location queryLoactionByID(int LocationID);

    int addNewLoaction(Location location);

    int deleteLocationByID(int LocationID);

    int updataLocation(Location location);

}
