package com.dao;

import com.pojo.Product;
import com.pojo.ProductImg;
import com.pojo.ProductSelection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> queryProductList();

    Product queryProductByID(int id);

}
