package com.service;

import com.dao.StoreInfoMapper;
import com.pojo.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class StoreInfoServiceImpl implements StoreInfoService{

    @Autowired
    private StoreInfoMapper storeInfoMapper;

    public void setStoreInfoMapper(StoreInfoMapper storeInfoMapper) {
        this.storeInfoMapper = storeInfoMapper;
    }

    @Override
    public StoreInfo queryStoreInfo() {
        return storeInfoMapper.queryStoreInfo();
    }
}
