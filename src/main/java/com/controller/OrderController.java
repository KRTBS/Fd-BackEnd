package com.controller;

import com.pojo.OrderForm;
import com.pojo.OrderFormBean;
import com.pojo.ResponseBean;
import com.service.OrderFormService;
import com.service.UserService;
import com.util.DateUtil;
import com.util.JwtUtils;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class OrderController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Autowired
    @Qualifier("orderFormServiceImpl")
    private OrderFormService orderFormService;

    @PostMapping("/auth/order/submit")
    public ResponseBean OrderFormSubmit(@RequestBody List<OrderFormBean> form, HttpServletRequest httpServletRequest) throws Exception {

        OrderForm orderForm = new OrderForm();
        orderForm.setOrderID(UUID.randomUUID().toString().replace("-", ""));
        orderForm.setUserID(userService
                .queryUserByName(JwtUtils
                        .getUsername(httpServletRequest
                                .getHeader("Authorization")))
                .getUserID());
        orderForm.setOrderForm(MyUtils.mapper.writeValueAsString(form));
        orderForm.TradingStatus_UNDONE();
        orderForm.setTime(DateUtil.GETIME());

        if (orderFormService.addNewOrderForm(orderForm) != 0) {
            return new ResponseBean().OK();
        } else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    @GetMapping("/auth/myorder")
    public ResponseBean getMyOrderForm(HttpServletRequest httpServletRequest) {
        List<OrderForm> orderFormList = orderFormService.getUserOrderFormByUserID(userService
                .queryUserByName(JwtUtils
                        .getUsername(httpServletRequest
                                .getHeader("Authorization")))
                .getUserID());
        if (orderFormList != null){
            return new ResponseBean(orderFormList).OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    @GetMapping("/auth/order/all")
    public ResponseBean getAllOrderForm(){
        List<OrderForm> orderFormList = orderFormService.queryAllOrderForm();
        Collections.reverse(orderFormList);
        return new ResponseBean(orderFormList).OK();
    }

    @PutMapping("/auth/order/changeState/{id}")
    public ResponseBean updataOrderState(@PathVariable int id){
        OrderForm orderForm = orderFormService.queryOrderFormByID(id);
        orderForm.setTradingStatus("DONE");
        orderFormService.changeOrderFormState(orderForm);
        return new ResponseBean().OK();
    }



}
