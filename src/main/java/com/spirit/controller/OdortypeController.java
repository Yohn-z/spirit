package com.spirit.controller;

import com.spirit.pojo.ROdortype;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.service.OdortypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/odort")
public class OdortypeController {

    @Autowired
    OdortypeService odortypeService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public PageResult getAllOdort(int page, int rows) {
        return odortypeService.getAllOdort(page,rows);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addOdort(@RequestBody ROdortype rOdortype) {
        return odortypeService.addOdort(rOdortype);
    }

    @RequestMapping("/del")
    public Result deleteOdortByOid(Long oId) {
        return odortypeService.deleteOdortByOid(oId);
    }

    @RequestMapping("/findone")
    public Result findOneOdortByOid(Long oId) {
        return odortypeService.findOneOdortByOid(oId);
    }

    @RequestMapping("/update")
    public Result updateOdort(@RequestBody ROdortype rOdortype) {
        return odortypeService.updateOdort(rOdortype);
    }

    @RequestMapping("/getlist")
    public List<ROdortype> getlist(){
        return odortypeService.getList();
    }
}
