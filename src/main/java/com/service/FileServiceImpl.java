package com.service;

import com.dao.FileMapper;
import com.pojo.ImgFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FileServiceImpl implements FileService{

    @Autowired
    private FileMapper fileMapper;

    public void setFileMapper(FileMapper fileMapper) {
        this.fileMapper = fileMapper;
    }

    @Override
    public ImgFile getImgFileByID(int id) {
        ImgFile imgFile = fileMapper.getImgFileByID(id);
        return imgFile;
    }

    @Override
    public ImgFile getImgFileByFileName(String fileName) {
        ImgFile imgFile = fileMapper.getImgFileByFileName(fileName);
        return imgFile;
    }

    @Override
    public int addNewImgFile(ImgFile imgFile) {
        int i = fileMapper.addNewImgFile(imgFile);
        return i;
    }
}
