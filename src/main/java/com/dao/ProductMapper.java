package com.dao;

import com.pojo.Carousel;
import com.pojo.Product;
import com.pojo.ProductImg;
import com.pojo.ProductSelection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> queryProductList();

    Product queryProductByID(int id);

    int updataProduct(Product product);

    int insertNewProduct(Product product);

    int deleteProductByID(int id);

}
