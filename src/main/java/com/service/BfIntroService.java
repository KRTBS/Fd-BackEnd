package com.service;

import com.pojo.BfIntro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BfIntroService {

    List<BfIntro> queryAllBfIntro();

    int updateIntro(BfIntro intro);

}
