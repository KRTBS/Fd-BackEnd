package com.service;

import com.pojo.ImgFile;
import org.springframework.stereotype.Service;

@Service
public interface FileService {

    ImgFile getImgFileByID(int id);

    ImgFile getImgFileByFileName(String fileName);

    int addNewImgFile(ImgFile imgFile);

}
