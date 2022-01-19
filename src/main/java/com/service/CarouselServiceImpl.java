package com.service;

import com.dao.CarouselMapper;
import com.pojo.Carousel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Map> queryAllCarsouelForManage() {
        return carouselMapper.queryAllCarsouelForManage();
    }

    @Override
    public int updateCarousel(Carousel carousel) {
        return carouselMapper.updateCarousel(carousel);
    }

    @Override
    public int deleteCarouselByID(int id) {
        return carouselMapper.deleteCarouselByID(id);
    }

    @Override
    public int insertNewCarousel(Carousel carousel) {
        carouselMapper.insertNewCarousel(carousel);
        return carousel.getId();
    }
}
