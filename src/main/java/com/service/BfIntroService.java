package com.service;

import com.pojo.BfIntro;

import java.util.List;

public interface BfIntroService {

    List<BfIntro> queryAllBfIntro();

    int updateIntro(BfIntro intro);

}
