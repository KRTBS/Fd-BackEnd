package com.service;

import com.dao.InfoMapper;
import com.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfoServiceImpl implements InfoService{

    @Autowired
    private InfoMapper infoMapper;

    public void setInfoMapper(InfoMapper infoMapper) {
        this.infoMapper = infoMapper;
    }

    @Override
    public List<Info> queryAllInfo() {
        return infoMapper.queryAllInfo();
    }

    @Override
    public Info queryInfoByID(int id) {
        return infoMapper.queryInfoByID(id);
    }

    @Override
    public int addNewInfo(Info info) {
        return infoMapper.addNewInfo(info);
    }

    @Override
    public int updateInfo(Info info) {
        return infoMapper.updateInfo(info);
    }

    @Override
    public int deleteInfoByID(int id) {
        return infoMapper.deleteInfoByID(id);
    }
}
