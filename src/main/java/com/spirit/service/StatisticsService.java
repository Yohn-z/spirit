package com.spirit.service;

import com.spirit.entity.OdortTypePercent;

import java.util.List;

public interface StatisticsService {


    /**
     * 获取所有酒品种数
     * @return
     */
    int getTypesNum();

    /**
     * 获取所有酒的总价值
     */
    double getTotalAssets();

    /**
     * 获取所有酒总容量（升）
     * @return
     */
    double getTotalLitre();

    /**
     * 获取酒的总瓶数
     * @return
     */
    int getTotalVaseNum();

    /**
     * 获取香型占比饼图
     * @return
     */
    List<OdortTypePercent> getOdortTypePercentData();
}
