package com.spirit.service;

import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.entity.YearsEntity;
import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquorCustom;
import com.spirit.pojo.RLiquordesc;
import com.spirit.pojo.vo.LQueryVo;

public interface SpiritService {

    PageResult findall(int page, int rows, LQueryVo lQueryVo);

    RLiquorCustom findOne(String lId);

    Result del(RLiquor rLiquor);

    void addSpirit(RLiquor rLiquor);

    void addSpiritdesc(RLiquordesc rLiquordesc);

    Result update(RLiquor rLiquor);

    int[] getYearData();
}
