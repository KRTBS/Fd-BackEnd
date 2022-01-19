package com.controller;

import com.pojo.*;
import com.service.*;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/open")
@CrossOrigin
public class IndexController {

    @Autowired
    private InfoService infoService;

    @Autowired
    private StoreInfoService storeInfoService;

    @GetMapping("/information/all")
    public ResponseBean getAllInfo() {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return new ResponseBean(info).OK();
    }

    @GetMapping("/information/index")
    public ResponseBean getIndexInfoList() {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return new ResponseBean(info.subList(0, 4)).OK();
    }

    @GetMapping("/information/{id}")
    public ResponseBean getInfoByID(@PathVariable int id) {
        return new ResponseBean(infoService.queryInfoByID(id)).OK();
    }

    @GetMapping("/information/store")
    public ResponseBean getStoreInformation() {
        return new ResponseBean(storeInfoService.queryStoreInfo()).OK();
    }

    @PostMapping("/order/submit")
    public ResponseBean handleOrderForm(@RequestBody List<OrderFormBean> form, HttpServletResponse httpServletResponse) {
        System.out.println(form.toString());
        return new ResponseBean().OK();
    }

}
