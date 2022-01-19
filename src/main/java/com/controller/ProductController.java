package com.controller;

import com.pojo.Product;
import com.pojo.ProductImg;
import com.pojo.ProductSelection;
import com.pojo.ResponseBean;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/open/product/list")
    public ResponseBean getProductList() {
        return new ResponseBean(productService.queryProductList()).OK();
    }

    @GetMapping("/open/product/{id}")
    public ResponseBean getProduct(@PathVariable int id) {
        return new ResponseBean(productService.queryProductByID(id)).OK();
    }

    //insert
    @PostMapping("/auth/product")
    public ResponseBean addNewProduct(@RequestBody Product product){
        if (productService.insertNewProduct(product) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    //updata
    @PutMapping("/auth/product")
    public ResponseBean updataProduct(@RequestBody Product product){
        if (productService.updataProduct(product) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    //delete
    @DeleteMapping("/auth/product/{id}")
    public ResponseBean deleteProductByID(@PathVariable int id){
        if (productService.deleteProductByID(id) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    //img



    @GetMapping("/open/product/carousel/{id}")
    public ResponseBean getProductCarousel(@PathVariable int id) {
        return new ResponseBean(productService.queryProductImgByID(id)).OK();
    }

    @PostMapping("/auth/product/carousel")
    public ResponseBean addNewProductImg(@RequestBody ProductImg img){
        if (productService.addNewProductImg(img) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    @DeleteMapping("/auth/product/carousel/{id}")
    public ResponseBean deleteProductImgByID(@PathVariable int id){
        return new ResponseBean(productService.deleteProductImgByID(id)).OK();
    }

    //selection

    @GetMapping("/open/product/selection/{id}")
    public ResponseBean getProductSelection(@PathVariable int id) {
        return new ResponseBean(productService.queryProductSelectionByID(id)).OK();
    }

    @PostMapping("/auth/product/selection")
    public ResponseBean addNewSelection(@RequestBody ProductSelection selection){
        if (productService.insertNewProductSelection(selection) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    @DeleteMapping("/auth/product/selection/{id}")
    public ResponseBean deleteSelectionByID(@PathVariable int id){
        return new ResponseBean(productService.deleteProductSelectionByID(id)).OK();
    }

}
