package com.spirit.service.impl;

import com.spirit.entity.OdortTypePercent;
import com.spirit.mapper.RLiquorMapper;
import com.spirit.mapper.RLiquordescMapper;
import com.spirit.mapper.ROdortypeMapper;
import com.spirit.mapper.ROdortypeMapperCustom;
import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquordesc;
import com.spirit.pojo.ROdortype;
import com.spirit.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private RLiquordescMapper rLiquordescMapper;

    @Autowired
    private RLiquorMapper rLiquorMapper;

    @Autowired
    private ROdortypeMapperCustom rOdortypeMapperCustom;


    @Override
    public int getTypesNum() {

        List<RLiquor> rLiquors = rLiquorMapper.selectByExample(null);

        return rLiquors.size();
    }

    @Override
    public double getTotalAssets() {

        double totalAssets = 0;

        List<RLiquordesc> rLiquordescs = rLiquordescMapper.selectByExample(null);

        for (RLiquordesc rLiquordesc:
             rLiquordescs) {

            if(rLiquordesc.getLdPrice() != null){

                //价格不为空或者0
                //获取该种酒的数量
                RLiquor liquor = rLiquorMapper.selectByPrimaryKey(rLiquordesc.getlId());

                double currAssets = 0;

                //该中酒的总价值
                if(liquor.getlNum() != null){
                    currAssets = liquor.getlNum() * rLiquordesc.getLdPrice();
                }

                totalAssets += currAssets;
            }

        }

        return totalAssets;
    }

    @Override
    public double getTotalLitre() {

        double totalLitre = 0;

        List<RLiquor> rLiquors = rLiquorMapper.selectByExample(null);

        for (RLiquor liquor:
             rLiquors) {

            if(liquor.getlNum() != 0 || liquor.getlNum() != null || liquor.getlCapacity() != 0 || liquor.getlCapacity()!= null){

                double currLitre = liquor.getlNum() * liquor.getlCapacity();

                totalLitre += currLitre;
            }

        }
        return totalLitre/1000;
    }

    @Override
    public int getTotalVaseNum() {

        int totalVaseNum = 0;

        List<RLiquor> rLiquors = rLiquorMapper.selectByExample(null);

        for (RLiquor liquor :
                rLiquors) {

            if(liquor.getlNum() != null || liquor.getlNum() != 0){
                totalVaseNum += liquor.getlNum();
            }
        }
        return totalVaseNum;
    }

    @Override
    public List<OdortTypePercent> getOdortTypePercentData() {
        return rOdortypeMapperCustom.getOdortTypePercents();
    }
}
