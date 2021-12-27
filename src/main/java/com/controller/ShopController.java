package com.controller;

import com.pojo.Shop;
import com.service.ShopService;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ShopController {

    @Autowired
    @Qualifier("shopServiceImpl")
    private ShopService shopService;

    @RequestMapping("/shoplist")
    public String ShopListByLocation() throws Exception {
        List<Shop> list = shopService.queryAllShop();
        return MyUtils.mapper.writeValueAsString(list);
    }

    @RequestMapping("/shoplist/{LocationID}")
    public String ShopListByLocation(@PathVariable int LocationID) throws Exception {
        List<Shop> list = shopService.queryShopByLocation(LocationID);
        return MyUtils.mapper.writeValueAsString(list);
    }


}
