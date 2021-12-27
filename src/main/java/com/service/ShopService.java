package com.service;

import com.pojo.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopService {

    List<Shop> queryAllShop();

    List<Shop> queryShopByLocation(int ShopLocation);
}
