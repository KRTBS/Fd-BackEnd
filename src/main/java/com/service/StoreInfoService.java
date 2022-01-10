package com.service;

import com.pojo.StoreInfo;
import org.springframework.stereotype.Service;

@Service
public interface StoreInfoService {

    StoreInfo queryStoreInfo();

}
