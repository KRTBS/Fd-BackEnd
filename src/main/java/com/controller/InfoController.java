package com.controller;

import com.pojo.Info;
import com.pojo.ResponseBean;
import com.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/open/information/all")
    public ResponseBean getAllInfo() {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return new ResponseBean(info).OK();
    }

    @GetMapping("/open/information/index")
    public ResponseBean getIndexInfoList() {
        List<Info> info = infoService.queryAllInfo();
        Collections.reverse(info);
        return new ResponseBean(info.subList(0, 4)).OK();
    }

    @GetMapping("/open/information/{id}")
    public ResponseBean getInfoByID(@PathVariable int id) {
        return new ResponseBean(infoService.queryInfoByID(id)).OK();
    }

    @PutMapping("/auth/information")
    public ResponseBean updataInfo(@RequestBody Info info){
        return new ResponseBean(infoService.updateInfo(info)).OK();
    }

    @PostMapping("/auth/information")
    public ResponseBean addNewInfo(@RequestBody Info info){
        return new ResponseBean(infoService.addNewInfo(info)).OK();
    }

    @DeleteMapping("/auth/information/{id}")
    public ResponseBean deleteInfoByID(@PathVariable int id){
        return new ResponseBean(infoService.deleteInfoByID(id)).OK();
    }

}
