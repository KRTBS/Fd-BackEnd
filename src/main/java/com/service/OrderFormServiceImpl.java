package com.service;

import com.dao.OrderFormMapper;
import com.pojo.OrderForm;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderFormServiceImpl implements OrderFormService{

    @Autowired
    private OrderFormMapper orderFormMapper;

    public void setOrderFormMapper(OrderFormMapper orderFormMapper) {
        this.orderFormMapper = orderFormMapper;
    }

    @Override
    public int addNewOrderForm(OrderForm orderForm) {
        return orderFormMapper.addNewOrderForm(orderForm);
    }

    @Override
    public List<OrderForm> getUserOrderFormByUserID(int userID) {
        return orderFormMapper.getUserOrderFormByUserID(userID);
    }

    @Override
    public List<OrderForm> queryAllOrderForm() {
        return orderFormMapper.queryAllOrderForm();
    }

    @Override
    public OrderForm queryOrderFormByID(int id) {
        return orderFormMapper.queryOrderFormByID(id);
    }

    @Override
    public int changeOrderFormState(OrderForm orderForm) {
        return orderFormMapper.changeOrderFormState(orderForm);
    }
}
