package com.service;

import com.pojo.Carousel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CarouselService {

    List<Carousel> queryAllCarousel();

    Carousel queryCarouselByID(int id);

    List<Map> queryAllCarsouelForManage();

    int updateCarousel(Carousel carousel);

    int deleteCarouselByID(int id);

    int insertNewCarousel(Carousel carousel);

}
