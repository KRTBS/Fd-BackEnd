package com.controller;

import com.pojo.*;
import com.service.*;
import com.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    private StoreInfoService storeInfoService;

    @GetMapping("/carousel")
    public ResponseBean getCarouselList() {
        List<Carousel> carousels = carouselService.queryAllCarousel();
        return new ResponseBean(carousels).OK();
    }

    @GetMapping("/introduction/index")
    public ResponseBean getBfIntro() {
        List<BfIntro> bfIntros = bfIntroService.queryAllBfIntro();
        return new ResponseBean(bfIntros).OK();
    }

    @GetMapping("/information/all")
    public ResponseBean getAllInfo() {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return new ResponseBean(info).OK();
    }

    @GetMapping("/information/index")
    public ResponseBean getIndexInfoList() {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return new ResponseBean(info.subList(0, 4)).OK();
    }

    @GetMapping("/information/{id}")
    public ResponseBean getInfoByID(@PathVariable int id) {
        return new ResponseBean(infoService.queryInfoByID(id)).OK();
    }

    @GetMapping("/product/list")
    public ResponseBean getProductList() {
        return new ResponseBean(productService.queryProductList()).OK();
    }

    @GetMapping("/product/{id}")
    public ResponseBean getProduct(@PathVariable int id) {
        return new ResponseBean(productService.queryProductByID(id)).OK();
    }

    @GetMapping("/product/carousel/{id}")
    public ResponseBean getProductCarousel(@PathVariable int id) {
        return new ResponseBean(productService.queryProductImgByID(id)).OK();
    }

    @GetMapping("/product/selection/{id}")
    public ResponseBean getProductSelection(@PathVariable int id) {
        return new ResponseBean(productService.queryProductSelectionByID(id)).OK();
    }

    @GetMapping("/information/store")
    public ResponseBean getStoreInformation() {
        return new ResponseBean(storeInfoService.queryStoreInfo()).OK();
    }

    @PostMapping("/order/submit")
    public ResponseBean handleOrderForm(@RequestBody List<OrderFormBean> form, HttpServletResponse httpServletResponse) {
        System.out.println(form.toString());
        return new ResponseBean().OK();
    }

}
