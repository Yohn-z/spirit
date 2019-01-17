package com.spirit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spirit.mapper.RLiquorMapper;
import com.spirit.mapper.ROdortypeMapper;
import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquorExample;
import com.spirit.pojo.ROdortype;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.service.OdortypeService;
import com.spirit.util.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdortypeServiceImpl implements OdortypeService {

    @Autowired
    private ROdortypeMapper rOdortypeMapper;

    @Autowired
    private RLiquorMapper rLiquorMapper;

    @Override
    public PageResult getAllOdort(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<ROdortype> OdortypeList = rOdortypeMapper.selectByExample(null);
        PageInfo<ROdortype> pageInfo=new PageInfo<ROdortype>(OdortypeList);

        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public Result addOdort(ROdortype rOdortype) {
        if(rOdortype.getoText()==null) {
            return new Result(false, "香型不能为空！");
        }else {

            List<ROdortype> list = rOdortypeMapper.selectByExample(null);

            for (ROdortype rO : list) {
                if(rO.getoText().equals(rOdortype.getoText())) {
                    return new Result(false, "该香型已经存在！");
                }
            }


            rOdortype.setoId(IDUtils.genItemId());
            rOdortypeMapper.insert(rOdortype);
            return new Result(true, "添加成功！");
        }

    }

    @Override
    public Result deleteOdortByOid(Long oId) {

        RLiquorExample example = new RLiquorExample();
        RLiquorExample.Criteria criteria = example.createCriteria();
        criteria.andOIdEqualTo(oId);
        List<RLiquor> rLiquors = rLiquorMapper.selectByExample(example);
        if(rLiquors.size()!=0){
            return new Result(false,"该香型已被使用，请先去移除");
        }

        ROdortype rOdortype = rOdortypeMapper.selectByPrimaryKey(oId);
        if(rOdortype == null) {
            return new Result(false, "不存在该香型！");
        }
        rOdortypeMapper.deleteByPrimaryKey(oId);

        return new Result(true, "删除成功!");
    }

    @Override
    public Result findOneOdortByOid(Long oId) {
        ROdortype rOdortype = rOdortypeMapper.selectByPrimaryKey(oId);
        if(rOdortype==null){
            return new Result(false, "不存在该香型！");
        }
        else{
            return new Result(true, "查找成功!",rOdortype);
        }
    }

    @Override
    public Result updateOdort(ROdortype rOdortype) {
        ROdortype rOdortype_db = rOdortypeMapper.selectByPrimaryKey(rOdortype.getoId());

        if(rOdortype_db==null){
            return new Result(false, "不存在该香型！");
        }
        else{
            rOdortypeMapper.updateByPrimaryKey(rOdortype);
            return new Result(true, "更新成功!");
        }
    }

    @Override
    public List<ROdortype> getList() {
        return rOdortypeMapper.selectByExample(null);
    }
}
