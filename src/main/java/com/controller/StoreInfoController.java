package com.controller;

import com.pojo.ResponseBean;
import com.pojo.StoreInfo;
import com.service.StoreInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class StoreInfoController {

    @Autowired
    private StoreInfoService storeInfoService;

    @GetMapping("/open/information/store")
    public ResponseBean getStoreInformation() {
        return new ResponseBean(storeInfoService.queryStoreInfo()).OK();
    }

    @PutMapping("/auth/information/store")
    public ResponseBean updataStoreInformation(@RequestBody StoreInfo info){
        if (storeInfoService.updataStoreInfo(info) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }
}
