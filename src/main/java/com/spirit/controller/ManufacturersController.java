package com.spirit.controller;

import com.spirit.pojo.RManufacturers;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.service.ManufacturersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturersController {

    @Autowired
    ManufacturersService manufacturersService;

    //获取所有厂家
    @RequestMapping("")
    public PageResult getAll(Integer page, Integer rows){
        return manufacturersService.getAll(page,rows);
    }
    //添加厂家
    @RequestMapping("/add")
    public Result addManufacturer(@RequestBody RManufacturers rManufacturers){
        return manufacturersService.addManufacturer(rManufacturers);
    }
    //删除厂家
    @RequestMapping("/del")
    public Result deleteManufBymId(Long mId){
        return manufacturersService.deleteManufBymId(mId);
    }
    //查看厂家
    @RequestMapping("/findone")
    public  Result findOneManufByMid(Long mId){
        return manufacturersService.findOneManufByMid(mId);
    }
    //修改厂家
    @RequestMapping("/update")
    public  Result updateOdort(@RequestBody RManufacturers rManufacturers){
        return manufacturersService.updateManuf(rManufacturers);
    }

    @RequestMapping("/getlist")
    public List<RManufacturers> getList(){
        return manufacturersService.getList();
    }
}
