package com.spirit.controller;


import com.spirit.entity.BaseParamEntity;
import com.spirit.entity.Result;
import com.spirit.service.SpiritService;
import com.spirit.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @Autowired
    private SpiritService spiritService;

    /**
     * 获取四个基本数字信息
     * @return
     */
    @RequestMapping(value = "/getbase",method = RequestMethod.GET)
    public Result getBaseParam(){
        return new Result(true,"操作成功",new BaseParamEntity(statisticsService.getTypesNum(),statisticsService.getTotalAssets(),statisticsService.getTotalLitre(),statisticsService.getTotalVaseNum()));
    }

    /**
     * 获取各香型占比数据
     * @return
     */
    @RequestMapping(value = "/getodortpie",method = RequestMethod.GET)
    public Result getOdortPieData(){
        return new Result(true,"获取成功",statisticsService.getOdortTypePercentData());
    }

    /**
     * 获取各年份酒的瓶数
     * @return
     */
    @RequestMapping(value = "/getyeardata",method = RequestMethod.GET)
    public Result getYearData(){
        return new Result(true,"获取成功",spiritService.getYearData());
    }

    @RequestMapping(value = "/yinguolinzhangyuhong/baseinfo",method = RequestMethod.POST)
    public Result getForSadasdaSdfsadfSdgsBaseParam(){
        return new Result(true,"操作成功",new BaseParamEntity(statisticsService.getTypesNum(),statisticsService.getTotalAssets(),statisticsService.getTotalLitre(),statisticsService.getTotalVaseNum()));
    }
}
