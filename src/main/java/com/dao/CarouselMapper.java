package com.dao;

import com.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarouselMapper {
    List<Carousel> queryAllCarousel();

    Carousel queryCarouselByID(int id);

    List<Map> queryAllCarsouelForManage();

    int updateCarousel(Carousel carousel);

    int deleteCarouselByID(int id);

    int insertNewCarousel(Carousel carousel);

}
