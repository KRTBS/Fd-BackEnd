package com.service;

import com.pojo.Carousel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarouselService {

    List<Carousel> queryAllCarousel();

    Carousel queryCarouselByID(int id);

}
