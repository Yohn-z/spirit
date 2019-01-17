package com.spirit.controller;


import com.spirit.mapper.RLiquordescMapperCustom;
import com.spirit.pojo.RLiquorCustom;
import com.spirit.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@Controller
public class FileExportController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RLiquordescMapperCustom rLiquordescMapperCustom;


    @RequestMapping(value = "/get",method = RequestMethod.POST)
    public void getData(HttpServletResponse response,String excelName){

        if(excelName == null || excelName.trim() == ""){
            excelName = "白酒收藏信息表";
        }

        try {
            logger.error("---------------"+excelName+".xls开始导出---------------");
            FileUtil.exportExcel(rLiquordescMapperCustom.getAllData(),"白酒库存信息","sheet1",RLiquorCustom.class,excelName+".xls",response);
            logger.error("---------------导出结束---------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
