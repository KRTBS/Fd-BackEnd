package com.dao;

import com.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {

    List<Shop> queryAllShop();

    List<Shop> queryShopByLocation(int ShopLocation);

}
