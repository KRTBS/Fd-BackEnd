package com.controller;

import com.util.MyUtils;
import com.pojo.Shop;
import com.pojo.ResponseBean;
import com.service.ShopService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin
public class BaseController {

    @Autowired
    @Qualifier("shopServiceImpl")
    ShopService shopService;

    @ResponseBody
    @RequestMapping("/index")
    public String index() throws Exception{
        List<Shop> list = shopService.queryAllShop();
        return MyUtils.mapper.writeValueAsString(list);
    }

    @ResponseBody
    @RequestMapping("/dest")
    public String testA() throws Exception{
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("jb","SB");
        map.put("xb","成功");
        return MyUtils.mapper.writeValueAsString(map);
    }

    @RequestMapping("/login2")
    public String test2() throws Exception{
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("jb",444);
        map.put("xb",111);
        return MyUtils.mapper.writeValueAsString(map);
    }

    @ResponseBody
    @RequestMapping("/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseBean unauthorized(){
        return new ResponseBean(401,"Unauthorized",null);
    }


}
