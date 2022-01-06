package com.service;

import com.dao.CarouselMapper;
import com.pojo.Carousel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarouselServiceImpl implements CarouselService{

    @Autowired
    private CarouselMapper carouselMapper;

    public void setCarouselMapper(CarouselMapper carouselMapper) {
        this.carouselMapper = carouselMapper;
    }

    @Override
    public List<Carousel> queryAllCarousel() {
        return carouselMapper.queryAllCarousel();
    }

    @Override
    public Carousel queryCarouselByID(int id) {
        return carouselMapper.queryCarouselByID(id);
    }
}
