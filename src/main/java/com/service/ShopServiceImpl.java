package com.service;

import com.dao.ShopMapper;
import com.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopMapper shopMapper;

    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public List<Shop> queryAllShop() {
        List<Shop> list = shopMapper.queryAllShop();
        return list;
    }

    @Override
    public List<Shop> queryShopByLocation(int ShopLocation) {
        List<Shop> list = shopMapper.queryShopByLocation(ShopLocation);
        return list;
    }
}
