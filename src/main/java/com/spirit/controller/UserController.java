package com.spirit.controller;

import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //获取所有用户
    @RequestMapping(value="",method= RequestMethod.GET)
    public PageResult getAllUsers(Integer page, Integer rows){
        return userService.getAllUsers(page,rows);
    }
    //禁止用户
    @RequestMapping(value="/del",method= RequestMethod.GET)
    public Result forbidUser(Long uId){
        return  userService.forbidUser(uId);
    }
    //解除禁止
    @RequestMapping(value="for",method= RequestMethod.GET)
    public Result unbanUser(Long uId){
        return userService.unbanUser(uId);
    }

    @RequestMapping(value="/yinguolinzhangyuhong/user",method= RequestMethod.POST)
    public PageResult getSyasDasdaHaonakl(Integer page, Integer rows){
        return userService.getAllUsers(page,rows);
    }
}
