package com.service;

import com.pojo.Info;

import java.util.List;

public interface InfoService {

    List<Info> queryAllInfo();

    Info queryInfoByID(int id);

}
