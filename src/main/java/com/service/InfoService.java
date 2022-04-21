package com.service;

import com.pojo.Info;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InfoService {

    List<Info> queryAllInfo();

    Info queryInfoByID(int id);

    int addNewInfo(Info info);

    int updateInfo(Info info);

    int deleteInfoByID(int id);

}
