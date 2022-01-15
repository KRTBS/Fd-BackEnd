package com.controller;

import com.pojo.BfIntro;
import com.pojo.ResponseBean;
import com.service.BfIntroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class IntroductionController {

    @Autowired
    private BfIntroService bfIntroService;

    @GetMapping("/open/introduction/index")
    public ResponseBean getBfIntro() {
        List<BfIntro> bfIntros = bfIntroService.queryAllBfIntro();
        return new ResponseBean(bfIntros).OK();
    }

    @PutMapping("/auth/introduction/index")
    public ResponseBean updateBfIntro(@RequestBody BfIntro intro){
        if (bfIntroService.updateIntro(intro) != 0){
            return new ResponseBean().OK();
        }else {
            return new ResponseBean().BAD_REQUEST();
        }

    }
}
