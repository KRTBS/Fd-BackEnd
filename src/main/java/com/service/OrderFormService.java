package com.service;

import com.pojo.OrderForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderFormService {
    int addNewOrderForm(OrderForm orderForm);

    List<OrderForm> getUserOrderFormByUserID(int userID);

    List<OrderForm> queryAllOrderForm();

    OrderForm queryOrderFormByID(int id);

    int changeOrderFormState(OrderForm orderForm);
}
