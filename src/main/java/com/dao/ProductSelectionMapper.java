package com.dao;

import com.pojo.ProductSelection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSelectionMapper {

    List<ProductSelection> queryProductSelectionByID(int itemid);

}
