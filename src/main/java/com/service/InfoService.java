package com.service;

import com.pojo.Info;

import java.util.List;

public interface InfoService {

    List<Info> queryAllInfo();

    Info queryInfoByID(int id);

    int addNewInfo(Info info);

    int updateInfo(Info info);

    int deleteInfoByID(int id);

}
