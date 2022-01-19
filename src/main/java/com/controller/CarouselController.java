package com.controller;


import com.pojo.Carousel;
import com.pojo.ResponseBean;
import com.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @GetMapping("/open/carousel")
    public ResponseBean getCarouselList() {
        List<Carousel> carousels = carouselService.queryAllCarousel();
        return new ResponseBean(carousels).OK();
    }

    @GetMapping("/auth/carousel")
    public ResponseBean getCarouselForManage(){
        List<Map> list = carouselService.queryAllCarsouelForManage();
        return new ResponseBean(list).OK();
    }

    @PutMapping("/auth/carousel")
    public ResponseBean updateCarousel(@RequestBody Carousel carousel){

        if (carouselService.updateCarousel(carousel) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }

    }

    @DeleteMapping("/auth/carousel/{id}")
    public ResponseBean deleteCarousel(@PathVariable int id){
        if (carouselService.deleteCarouselByID(id) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    @PostMapping("/auth/carousel")
    public ResponseBean addNewCarousel(@RequestBody Carousel carousel){
        if (carouselService.insertNewCarousel(carousel) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

}
