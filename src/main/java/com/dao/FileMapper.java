package com.dao;

import com.pojo.ImgFile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {

    ImgFile getImgFileByID(int id);

    ImgFile getImgFileByFileName(String fileName);

    int addNewImgFile(ImgFile imgFile);

}
