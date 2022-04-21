package com.dao;

import com.pojo.OrderForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderFormMapper {

    int addNewOrderForm(OrderForm orderForm);

    List<OrderForm> getUserOrderFormByUserID(int userID);

    List<OrderForm> queryAllOrderForm();

    OrderForm queryOrderFormByID(int id);

    int changeOrderFormState(OrderForm orderForm);

}
