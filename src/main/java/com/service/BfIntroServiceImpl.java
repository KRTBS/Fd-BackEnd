package com.service;

import com.dao.BfIntroMapper;
import com.pojo.BfIntro;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BfIntroServiceImpl implements BfIntroService{

    @Autowired
    private BfIntroMapper bfIntroMapper;

    public void setBfIntroMapper(BfIntroMapper bfIntroMapper) {
        this.bfIntroMapper = bfIntroMapper;
    }

    @Override
    public List<BfIntro> queryAllBfIntro() {
        return bfIntroMapper.queryAllBfIntro();
    }

    @Override
    public int updateIntro(BfIntro intro) {
        return bfIntroMapper.updateIntro(intro);
    }
}
