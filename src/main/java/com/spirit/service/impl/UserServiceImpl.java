package com.spirit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spirit.entity.PageResult;
import com.spirit.entity.Result;
import com.spirit.mapper.RUserMapper;
import com.spirit.pojo.RUser;
import com.spirit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    RUserMapper rUserMapper;

    @Override
    public PageResult getAllUsers(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<RUser> list = rUserMapper.selectByExample(null);
        PageInfo<RUser> pageInfo=new PageInfo<RUser>(list);

        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public Result forbidUser(Long uId) {
        RUser rUser = rUserMapper.selectByPrimaryKey(uId);
        if(rUser==null){
            return new Result(false, "不存在该用户！");
        }
        else{
            rUser.setuStatus(0);
            rUserMapper.updateByPrimaryKey(rUser);
            return new Result(true, "已经禁止该用户！");
        }
    }

    @Override
    public Result unbanUser(Long uId) {
        RUser rUser = rUserMapper.selectByPrimaryKey(uId);
        if(rUser==null){
            return new Result(false, "不存在该用户！");
        }
        else{
            rUser.setuStatus(1);
            rUserMapper.updateByPrimaryKey(rUser);
            return new Result(true, "已经解除禁止该用户！");
        }
    }
}
