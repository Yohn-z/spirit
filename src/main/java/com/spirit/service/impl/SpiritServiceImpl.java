package com.spirit.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.entity.YearsEntity;
import com.spirit.mapper.*;
import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquorCustom;
import com.spirit.pojo.RLiquordesc;
import com.spirit.pojo.vo.LQueryVo;
import com.spirit.service.SpiritService;
import com.spirit.util.EntityChange;
import com.spirit.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SpiritServiceImpl implements SpiritService {


    @Autowired
    private RLiquorMapperCustom rLiquorMapperCusto;

    @Autowired
    private RLiquorMapper rLiquorMapper;

    @Autowired
    private RLiquordescMapper rLiquordescMapper;

    @Autowired
    private RLiquordescMapperCustom rLiquordescMapperCustom;

    @Autowired
    private RLiquorQueryCustomMapper rLiquorQueryCustomMapper;

    @Override
    public RLiquorCustom findOne(String lId) {
        return rLiquordescMapperCustom.findOneBylId(lId);
    }

    @Override
    public Result del(RLiquor rLiquor) {

        if(rLiquor.getlNum() == null || rLiquor.getlNum() == 0){
            return new Result(false,"请填写出库数");
        }

        if(rLiquor.getlId() == null || rLiquor.getlId().equals("")){
            return new Result(false,"未知异常，请与管理员联系");
        }

        RLiquor liquor = rLiquorMapper.selectByPrimaryKey(rLiquor.getlId());

        if(liquor.getlNum()<rLiquor.getlNum()){
            return new Result(false,"库存数量不足！");
        }

        if(liquor.getlNum() == rLiquor.getlNum()){
            rLiquorMapper.deleteByPrimaryKey(rLiquor.getlId());
            rLiquordescMapper.deleteByPrimaryKey(rLiquor.getlId());
        }

        if(liquor.getlNum() > rLiquor.getlNum()){
            liquor.setlNum(liquor.getlNum() - rLiquor.getlNum());
            rLiquorMapper.updateByPrimaryKey(liquor);
        }

        return new Result(true,"出库成功");
    }

    @Override
    public PageResult findall(int page, int rows, LQueryVo lQueryVo){

        PageHelper.startPage(page,rows);

        Page<RLiquorCustom> findall = (Page<RLiquorCustom>) rLiquorQueryCustomMapper.findLiquorList(lQueryVo);

        return new PageResult(findall.getTotal(),findall.getResult());
    }

    @Override
    public void addSpirit(RLiquor rLiquor) {
        rLiquorMapper.insert(rLiquor);
    }

    @Override
    public void addSpiritdesc(RLiquordesc rLiquordesc) {
        rLiquordescMapper.insert(rLiquordesc);
    }


    @Override
    public Result update(RLiquor rLiquor) {

        if(rLiquor.getlId()==null){
            return new Result(false,"不存在");
        }

        //1.必要参数校验
        if(rLiquor.getlName() == null || rLiquor.getlName().trim().equals("") || rLiquor.getoId() == null || rLiquor.getlDegrees() == 0 || rLiquor.getlNum() == null || rLiquor.getlNum() == 0){
            return new Result(false,"请填写必要信息完整");
        }

        //2.组装RLiquor对象
        RLiquor liquor = EntityChange.toRLiquor(rLiquor,rLiquor.getlId());
        //3.组装RLiquordesc对象
        RLiquordesc rLiquordesc = EntityChange.toRLiquordesc(rLiquor,rLiquor.getlId());
        rLiquorMapper.updateByPrimaryKey(liquor);
        rLiquordescMapper.updateByPrimaryKey(rLiquordesc);

        return new Result(true,"更新成功");
    }

    @Override
    public int[] getYearData() {

        YearsEntity yearData = rLiquorMapperCusto.getYearData(TimeUtils.getCurrentYear());

        int[] yearsData = new int[6];

        if(yearData != null){

            yearsData[0] = yearData.getInOne();

            yearsData[1] = yearData.getElderOne();

            yearsData[2] = yearData.getElderTwo();

            yearsData[3] = yearData.getElderFive();

            yearsData[4] = yearData.getElderTen();

            yearsData[5] = yearData.getElderTwenty();
        }
        return yearsData;
    }
}
