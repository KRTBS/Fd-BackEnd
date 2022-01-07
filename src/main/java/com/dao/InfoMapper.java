package com.dao;

import com.pojo.Info;

import java.util.List;

public interface InfoMapper {

    List<Info> queryAllInfo();

    Info queryInfoByID(int id);

}
