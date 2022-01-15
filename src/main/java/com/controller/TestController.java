package com.controller;

import com.pojo.ResponseBean;
import com.service.CarouselService;
import com.service.ProductService;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@CrossOrigin
public class TestController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CarouselService carouselService;

    @RequestMapping("/test")
    public ResponseBean Test(){
        //return new ResponseBean(productService.queryProductList()).OK();
        return new ResponseBean(carouselService.queryAllCarsouelForManage()).OK();
    }

    @RequestMapping("/dest")
    public ResponseBean dest(){
        return new ResponseBean(productService.queryProductList()).OK();
    }

}
