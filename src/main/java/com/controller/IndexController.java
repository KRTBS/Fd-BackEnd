package com.controller;

import com.pojo.BfIntro;
import com.pojo.Carousel;
import com.pojo.Info;
import com.service.BfIntroService;
import com.service.CarouselService;
import com.service.InfoService;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/open")
public class IndexController {

    @Autowired
    private CarouselService carouselService;

    @Autowired
    private BfIntroService bfIntroService;

    @Autowired
    private InfoService infoService;

    @GetMapping("/carousel")
    public String getCarouselList() throws Exception{
        List<Carousel> carousels = carouselService.queryAllCarousel();
        return MyUtils.mapper.writeValueAsString(carousels);
    }

    @GetMapping("/introduction/index")
    public String getBfIntro() throws Exception{
        List<BfIntro> bfIntros = bfIntroService.queryAllBfIntro();
        return MyUtils.mapper.writeValueAsString(bfIntros);
    }

    @GetMapping("/information/index")
    public String getIndexInfoList() throws Exception{
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return MyUtils.mapper.writeValueAsString(info.subList(0,4));
    }

}
