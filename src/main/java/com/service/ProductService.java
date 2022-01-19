package com.service;

import com.pojo.Carousel;
import com.pojo.Product;
import com.pojo.ProductImg;
import com.pojo.ProductSelection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> queryProductList();

    Product queryProductByID(int id);

    int updataProduct(Product product);

    int insertNewProduct(Product product);

    int deleteProductByID(int id);

    //img

    List<ProductImg> queryProductImgByID(int itemid);

    int addNewProductImg(ProductImg img);

    int deleteProductImgByID(int id);

    //selection

    List<ProductSelection> queryProductSelectionByID(int itemid);

    int insertNewProductSelection(ProductSelection selection);

    int deleteProductSelectionByID(int id);


}
