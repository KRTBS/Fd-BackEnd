package com.controller;

import com.pojo.Location;
import com.pojo.Shop;
import com.service.LocationService;
import com.service.ShopService;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LocationController {

    @Autowired
    @Qualifier("locationServiceImpl")
    private LocationService locationService;

    @RequestMapping("/location")
    public String allLocation() throws Exception{
        List<Location> locations = locationService.queryAllLocation();

        System.out.println(locations.toString());

        return MyUtils.mapper.writeValueAsString(locations);
    }
}
