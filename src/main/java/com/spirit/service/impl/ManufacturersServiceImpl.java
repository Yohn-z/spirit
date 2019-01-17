package com.spirit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spirit.mapper.RLiquordescMapper;
import com.spirit.mapper.RManufacturersMapper;
import com.spirit.pojo.RLiquordesc;
import com.spirit.pojo.RLiquordescExample;
import com.spirit.pojo.RManufacturers;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.service.ManufacturersService;
import com.spirit.util.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturersServiceImpl implements ManufacturersService {

    @Autowired
    RManufacturersMapper rManufacturersMapper;

    @Autowired
    private RLiquordescMapper rLiquordescMapper;

    @Override
    public PageResult getAll(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<RManufacturers> list = rManufacturersMapper.selectByExample(null);
        PageInfo<RManufacturers> pageInfo=new PageInfo<RManufacturers>(list);

        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public Result addManufacturer(RManufacturers rManufacturers) {
        if(rManufacturers.getmName()==null) {
            return new Result(false, "厂家名称不能为空！");
        }else {

            List<RManufacturers> list = rManufacturersMapper.selectByExample(null);

            for (RManufacturers rM : list) {
                if(rM.getmName().equals(rManufacturers.getmName())) {
                    return new Result(false, "该厂家名已经存在！");
                }
            }


            rManufacturers.setmId(IDUtils.genItemId());
            rManufacturersMapper.insert(rManufacturers);
            return new Result(true, "添加成功！");
        }
    }

    @Override
    public Result deleteManufBymId(Long mId) {

        RLiquordescExample example = new RLiquordescExample();
        RLiquordescExample.Criteria criteria = example.createCriteria();
        criteria.andMIdEqualTo(mId);
        List<RLiquordesc> rLiquordescs = rLiquordescMapper.selectByExample(example);
        if(rLiquordescs.size()!=0){
            return new Result(false,"该厂商已经被使用，请先去移除");
        }

        RManufacturers rManufacturers= rManufacturersMapper.selectByPrimaryKey(mId);
        if(rManufacturers == null) {
            return new Result(false, "该厂家不存在！");
        }
        rManufacturersMapper.deleteByPrimaryKey(mId);

        return new Result(true, "删除成功!");
    }

    @Override
    public Result findOneManufByMid(Long mId) {
        RManufacturers rManufacturers = rManufacturersMapper.selectByPrimaryKey(mId);
        if(rManufacturers==null){
            return new Result(false, "该厂家不存在！");
        }
        else{
            return new Result(true, "查找成功!",rManufacturers);
        }
    }

    @Override
    public Result updateManuf(RManufacturers rManufacturers) {
        RManufacturers rManufacturers_db = rManufacturersMapper.selectByPrimaryKey(rManufacturers.getmId());

        if(rManufacturers_db==null){
            return new Result(false, "该厂家不存在！");
        }
        else{
            rManufacturersMapper.updateByPrimaryKey(rManufacturers);
            return new Result(true, "更新成功!");
        }
    }

    @Override
    public List<RManufacturers> getList() {
        return rManufacturersMapper.selectByExample(null);
    }
}
