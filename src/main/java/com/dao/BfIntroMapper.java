package com.dao;

import com.pojo.BfIntro;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BfIntroMapper {

     List<BfIntro> queryAllBfIntro();

}
