package com.dao;

import com.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarouselMapper {
    List<Carousel> queryAllCarousel();

    Carousel queryCarouselByID(int id);

}
