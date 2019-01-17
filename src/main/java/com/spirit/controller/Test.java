package com.spirit.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.spirit.entity.Result;
import com.spirit.mapper.RLiquorMapper;
import com.spirit.mapper.RLiquordescMapper;
import com.spirit.mapper.RManufacturersMapper;
import com.spirit.mapper.ROdortypeMapper;
import com.spirit.pojo.*;
import com.spirit.service.StatisticsService;
import com.spirit.util.IDUtils;
import com.spirit.util.TimeUtils;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.List;
import java.util.Map;

@Controller
public class Test {

    @Autowired
    private  ROdortypeMapper rOdortypeMapper;

    @Autowired
    private RManufacturersMapper rManufacturersMapper;

    @Autowired
    private RLiquorMapper rLiquorMapper;

    @Autowired
    private RLiquordescMapper rLiquordescMapper;

    @Autowired
    private StatisticsService statisticsService;

    @ResponseBody
    @RequestMapping("/import")
    public Result importTest(String[] args){

        String path = "C:\\Users\\Administrator\\Desktop\\user.xls";

        int count = 0;

        try {
            ImportParams importParams = new ImportParams();
            importParams.setHeadRows(1);
            importParams.setTitleRows(1);
            List<RLiquorCustom> list = ExcelImportUtil.importExcel(new File(path), RLiquorCustom.class,importParams);

            List<ROdortype> rOdortypes = rOdortypeMapper.selectByExample(null);

            List<RManufacturers> rManufacturers = rManufacturersMapper.selectByExample(null);



            /*for (RLiquorCustom rLiquorCustom:
                 list) {

                RLiquor liquor = new RLiquor();

                String spiritId = IDUtils.getSpiritId();

                liquor.setlId(spiritId);

                liquor.setlName(rLiquorCustom.getlName());

                for (ROdortype rOdortype:
                     rOdortypes) {
                    if (rOdortype.getoText().equals(rLiquorCustom.getoText())){
                        liquor.setoId(rOdortype.getoId());
                    }
                }

                liquor.setlDegrees(rLiquorCustom.getlDegrees());

                liquor.setlCapacity(rLiquorCustom.getlCapacity());

                liquor.setlNum(rLiquorCustom.getlNum());

                String producedtime = rLiquorCustom.getlProducedtime();

               liquor.setlProducedtime(TimeUtils.dateFormat(producedtime));

                RLiquordesc rLiquordesc = new RLiquordesc();

                rLiquordesc.setlId(spiritId);

                for (RManufacturers rManufacturers1:
                     rManufacturers) {

                    if(rManufacturers1.getmName().equals(rLiquorCustom.getmName())){
                        rLiquordesc.setmId(rManufacturers1.getmId());
                    }
                }

                rLiquordesc.setLdBefore("无");

                rLiquordesc.setLdBack("无");

                rLiquordesc.setLdTop("无");

                rLiquordesc.setLdAddtime(TimeUtils.getTime());

                rLiquorMapper.insert(liquor);

                rLiquordescMapper.insert(rLiquordesc);

                count ++;

            }*/


        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(true,"成功导入数:"+count);
    }

    @RequestMapping("/set")
    @ResponseBody
    public Result setSealTo(){

        int count = 0;

        List<RLiquordesc> rLiquordescs = rLiquordescMapper.selectByExample(null);


        for (RLiquordesc rLiquordesc:
             rLiquordescs) {

            rLiquordesc.setLdSeal(0);

            rLiquordescMapper.updateByPrimaryKey(rLiquordesc);

            count ++;
        }

        return new Result(true,"成功数："+count);

    }

    @RequestMapping("/test/count")
    @ResponseBody
    public Result getCountNum(){

        Map<String ,Object> map = new HashedMap();

        map.put("品种数",statisticsService.getTypesNum());

        map.put("总价值",statisticsService.getTotalAssets());

        map.put("总升数",statisticsService.getTotalLitre());

        map.put("总瓶数",statisticsService.getTotalVaseNum());


        return new Result(true,"获取成功",map);
    }

}
