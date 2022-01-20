package com.dao;

import com.pojo.StoreInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreInfoMapper {

    StoreInfo queryStoreInfo();

    int updataStoreInfo(StoreInfo storeInfo);

}
