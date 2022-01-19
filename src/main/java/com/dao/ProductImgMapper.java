package com.dao;

import com.pojo.ProductImg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductImgMapper {

    List<ProductImg> queryProductImgByID(int itemid);

    int addNewProductImg(ProductImg img);

    int deleteProductImgByID(int id);

    int deleteProductImgByItemID(int itemid);

}
