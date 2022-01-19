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

    //

    @Override
    public List<Product> queryProductList() {
        return productMapper.queryProductList();
    }

    @Override
    public Product queryProductByID(int id) {
        return productMapper.queryProductByID(id);
    }

    @Override
    public int insertNewProduct(Product product) {
        productMapper.insertNewProduct(product);
        return product.getId();
    }

    @Override
    public int updataProduct(Product product) {
        return productMapper.updataProduct(product);
    }

    @Override
    public int deleteProductByID(int id) {
        productMapper.deleteProductByID(id);
        productImgMapper.deleteProductImgByItemID(id);
        productSelectionMapper.deleteProductSelectionByItemID(id);
        return 1;
    }

    //img

    @Override
    public List<ProductImg> queryProductImgByID(int itemid) {
        return productImgMapper.queryProductImgByID(itemid);
    }

    @Override
    public int addNewProductImg(ProductImg img) {
        return productImgMapper.addNewProductImg(img);
    }

    @Override
    public int deleteProductImgByID(int id) {
        return productImgMapper.deleteProductImgByID(id);
    }

    //selection

    @Override
    public List<ProductSelection> queryProductSelectionByID(int itemid) {
        return productSelectionMapper.queryProductSelectionByID(itemid);
    }

    @Override
    public int insertNewProductSelection(ProductSelection selection) {
        return productSelectionMapper.insertNewProductSelection(selection);
    }

    @Override
    public int deleteProductSelectionByID(int id) {
        return productSelectionMapper.deleteProductSelectionByID(id);
    }
}
