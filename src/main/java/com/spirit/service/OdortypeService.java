package com.spirit.service;

import com.spirit.pojo.ROdortype;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;

import java.util.List;

public interface OdortypeService {

    //获取所有香型
    public PageResult getAllOdort(Integer page, Integer size);
    //添加香型
    public Result addOdort(ROdortype rOdortype);
    //删除香型
    public Result deleteOdortByOid(Long oId);
    //查看香型
    public  Result findOneOdortByOid(Long oId);
    //修改香型
    public  Result updateOdort(ROdortype rOdortype);

    //获取集合列表
    public List<ROdortype> getList();
}
