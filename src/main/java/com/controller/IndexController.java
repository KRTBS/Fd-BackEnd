package com.controller;

import com.pojo.BfIntro;
import com.pojo.Carousel;
import com.pojo.Info;
import com.pojo.ResponseBean;
import com.service.BfIntroService;
import com.service.CarouselService;
import com.service.InfoService;
import com.service.ProductService;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/open")
@CrossOrigin
public class IndexController {

    @Autowired
    private CarouselService carouselService;

    @Autowired
    private BfIntroService bfIntroService;

    @Autowired
    private InfoService infoService;

    @Autowired
    private ProductService productService;

    @GetMapping("/carousel")
    public String getCarouselList() throws Exception{
        List<Carousel> carousels = carouselService.queryAllCarousel();
        return MyUtils.mapper.writeValueAsString(new ResponseBean(carousels).OK());
    }

    @GetMapping("/introduction/index")
    public String getBfIntro() throws Exception{
        List<BfIntro> bfIntros = bfIntroService.queryAllBfIntro();
        return MyUtils.mapper.writeValueAsString(new ResponseBean(bfIntros).OK());
    }

    @GetMapping("/information/all")
    public String getAllInfo() throws Exception {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return MyUtils.mapper.writeValueAsString(new ResponseBean(info).OK());
    }

    @GetMapping("/information/index")
    public String getIndexInfoList() throws Exception{
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return MyUtils.mapper.writeValueAsString(new ResponseBean(info.subList(0,4)).OK());
    }

    @GetMapping("/information/{id}")
    public String getInfoByID(@PathVariable int id) throws Exception{
        return MyUtils.mapper.writeValueAsString(new ResponseBean(infoService.queryInfoByID(id)).OK());
    }

    @GetMapping("/product/list")
    public String getProductList() throws Exception {
        return MyUtils.mapper.writeValueAsString(
                new ResponseBean(
                        productService.queryProductList()
                ).OK()
        );
    }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id) throws Exception{
        return MyUtils.mapper.writeValueAsString(
                new ResponseBean(
                        productService.queryProductByID(id)
                ).OK()
        );
    }

    @GetMapping("/product/carousel/{id}")
    public String getProductCarousel(@PathVariable int id) throws Exception {
        return MyUtils.mapper.writeValueAsString(
                new ResponseBean(
                        productService.queryProductImgByID(id)
                ).OK()
        );
    }

    @GetMapping("/product/selection/{id}")
    public String getProductSelection(@PathVariable int id) throws Exception{
        return MyUtils.mapper.writeValueAsString(
                new ResponseBean(
                        productService.queryProductSelectionByID(id)
                ).OK()
        );
    }

}
