package com.service;

import com.pojo.Product;
import com.pojo.ProductImg;
import com.pojo.ProductSelection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> queryProductList();

    Product queryProductByID(int id);

    List<ProductImg> queryProductImgByID(int itemid);

    List<ProductSelection> queryProductSelectionByID(int itemid);
}
