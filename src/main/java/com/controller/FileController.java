package com.controller;

import com.pojo.ImgFile;
import com.service.FileService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@ResponseBody
public class FileController {

    @Autowired
    @Qualifier("fileServiceImpl")
    FileService fileService;

    @RequestMapping("/imgUpLoad")
    public String upload(MultipartFile file) throws IOException {
        String extension = "."+ FilenameUtils.getExtension(file.getOriginalFilename());
        String fileName = UUID.randomUUID().toString()+extension;

        ImgFile imgFile = new ImgFile(fileName);
        System.out.println(imgFile);

        String realPath = "E:\\worksapce\\fileSave";
        file.transferTo(new File(realPath,fileName));

        fileService.addNewImgFile(imgFile);

        return "ok";
    }

    @RequestMapping("/api/img/{imgName}")
    public String getImg(@PathVariable String imgName){
        return imgName;
    }
}
