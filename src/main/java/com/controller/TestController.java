package com.controller;

import com.pojo.ResponseBean;
import com.service.ProductService;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/test")
    public String Test() throws Exception {
        return MyUtils.mapper.writeValueAsString(new ResponseBean(productService.queryProductList()).OK());
    }

}
