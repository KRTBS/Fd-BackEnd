package com.dao;

import com.pojo.BfIntro;
import com.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BfIntroMapper {

     List<BfIntro> queryAllBfIntro();

     int updateIntro(BfIntro intro);

}
