package com.service;

import com.dao.ProductImgMapper;
import com.dao.ProductMapper;
import com.dao.ProductSelectionMapper;
import com.pojo.Product;
import com.pojo.ProductImg;
import com.pojo.ProductSelection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductImgMapper productImgMapper;

    @Autowired
    private ProductSelectionMapper productSelectionMapper;

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public void setProductImgMapper(ProductImgMapper productImgMapper) {
        this.productImgMapper = productImgMapper;
    }

    public void setProductSelectionMapper(ProductSelectionMapper productSelectionMapper) {
        this.productSelectionMapper = productSelectionMapper;
    }

    @Override
    public List<Product> queryProductList() {
        return productMapper.queryProductList();
    }

    @Override
    public Product queryProductByID(int id) {
        return productMapper.queryProductByID(id);
    }

    @Override
    public List<ProductImg> queryProductImgByID(int itemid) {
        return productImgMapper.queryProductImgByID(itemid);
    }

    @Override
    public List<ProductSelection> queryProductSelectionByID(int itemid) {
        return productSelectionMapper.queryProductSelectionByID(itemid);
    }
}
