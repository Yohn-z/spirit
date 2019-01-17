package com.spirit.service;

import com.spirit.pojo.RManufacturers;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;

import java.util.List;

public interface ManufacturersService {
    //获取所有厂家
    public PageResult getAll(Integer page, Integer size);
    //添加厂家
    public Result addManufacturer(RManufacturers rManufacturers);
    //删除厂家
    public Result deleteManufBymId(Long mId);
    //查看厂家
    public  Result findOneManufByMid(Long mId);
    //修改厂家
    public  Result updateManuf(RManufacturers rManufacturers);

    //获取厂商列表
    List<RManufacturers> getList();
}
