package com.spirit.service;

import com.spirit.entity.PageResult;
import com.spirit.entity.Result;


public interface UserService {
    //获取所有用户
    public PageResult getAllUsers(Integer page, Integer rows);
    //禁止用户
    public Result forbidUser(Long uId);
    //解除禁止
    public Result unbanUser(Long uId);

}
