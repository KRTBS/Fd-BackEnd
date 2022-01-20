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





    @PostMapping("/order/submit")
    public ResponseBean handleOrderForm(@RequestBody List<OrderFormBean> form, HttpServletResponse httpServletResponse) {
        System.out.println(form.toString());
        return new ResponseBean().OK();
    }

}
