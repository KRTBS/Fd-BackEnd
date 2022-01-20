package com.dao;

import com.pojo.Info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InfoMapper {

    List<Info> queryAllInfo();

    Info queryInfoByID(int id);

    int addNewInfo(Info info);

    int updateInfo(Info info);

    int deleteInfoByID(int id);

}
