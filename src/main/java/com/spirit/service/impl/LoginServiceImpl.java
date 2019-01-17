package com.spirit.service.impl;

import com.spirit.entity.Result;
import com.spirit.mapper.RUserMapper;
import com.spirit.pojo.RUser;
import com.spirit.pojo.RUserExample;
import com.spirit.service.LoginService;
import com.spirit.util.IDUtils;
import com.spirit.util.MD5Utils;
import com.spirit.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.security.provider.MD5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Time;
import java.util.List;
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private RUserMapper rUserMapper;

    @Override
    public Result login(RUser rUser, HttpSession session, HttpServletRequest request) {

        if(rUser.getuName() == null || rUser.equals("") || rUser.getuPass() == null || rUser.getuPass().equals("")){
            return new Result(false,"请填写信息完整");
        }

        List<RUser> rUsers = findUserByName(rUser.getuName());

        if(rUsers.size() == 0){
            return new Result(false,"用户名不存在！");
        }

        if(rUsers.size() > 1){
            return new Result(false,"未知错误，请联系管理员");
        }

        RUser user = rUsers.get(0);

        if(user.getuStatus() == 0){
            return new Result(false,"对不起，您的账号已被冻结");
        }

        if(user.getuPass().equals(MD5Utils.MD5(rUser.getuPass()))){

            String ip = request.getRemoteAddr();

            user.setuIp(ip);

            user.setuLastTime(TimeUtils.getTime());

            rUserMapper.updateByPrimaryKey(user);

            user.setuPass(null);

            session.setAttribute("nuser",user);

            return new Result(true, "登录成功");
        }else {
            return new Result(false,"密码错误！");
        }
    }


    @Override
    public Result register(RUser rUser, HttpSession session,HttpServletRequest request) {

        if (rUser.getuName() == null || rUser.getuName().trim() == "" || rUser.getuPass() == null || rUser.getuPass().trim() == ""){
            return new Result(false,"请填写信息完整");
        }

        List<RUser> rusers = findUserByName(rUser.getuName());

        if(rusers.size() != 0){
            return new Result(false,"用户名已存在");
        }

        rUser.setuId(IDUtils.genItemId());

        rUser.setuCreatTime(TimeUtils.getTime());

        rUser.setuRole(0);

        rUser.setuPass(MD5Utils.MD5(rUser.getuPass()));

        rUser.setuStatus(1);

        rUser.setuLastTime(TimeUtils.getTime());

        rUser.setuIp(request.getRemoteAddr());

        int insert = rUserMapper.insert(rUser);

        if(insert == 1){

            rUser.setuPass(null);

            session.setAttribute("nuser",rUser);

            return new Result(true,"注册成功");
        }


        return new Result(false,"系统异常，请联系管理员");
    }

    private List<RUser> findUserByName(String uName){
        RUserExample example = new RUserExample();
        RUserExample.Criteria criteria = example.createCriteria();
        criteria.andUNameEqualTo(uName);
        List<RUser> rUsers = rUserMapper.selectByExample(example);
        return rUsers;
    }

    @Override
    public Result pass(HttpSession session, String oPass, String nPass) {

        RUser ruser = (RUser)session.getAttribute("nuser");
        Long aLong = ruser.getuId();
        if(oPass.equals(nPass)){
            return new Result(false,"原密码不能与旧密码相同");
        }
        if(ruser!=null){
            if(aLong!=null&&aLong!=0){
                RUser rUser = rUserMapper.selectByPrimaryKey(aLong);
                String s = MD5Utils.MD5(oPass);
                if(s.equals(rUser.getuPass())){
                    //修改密码
                    rUser.setuPass(MD5Utils.MD5(nPass));
                    rUserMapper.updateByPrimaryKey(rUser);

                    return new Result(true,"修改成功");
                }
                else{
                    return new Result(false,"旧密码不正确");
                }
            }
        }
        else {
            return new Result(false,"请先登陆");
        }

        return new Result(false,"系统异常，请联系管理员");
    }
}
