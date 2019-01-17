package com.spirit.controller;

import com.spirit.entity.Result;
import com.spirit.pojo.RUser;
import com.spirit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;


    /**
     * 是否登录
     * @param session
     * @return
     */
    @RequestMapping("/il")
    public Result isLogin(HttpSession session){

        RUser nuser = (RUser) session.getAttribute("nuser");

        if(nuser == null){
            return new Result(false,"未登录");
        }else{
            return new Result(true,"已登录",nuser);
        }
    }

    /**
     * 登录
     * @param rUser
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@RequestBody RUser rUser , HttpSession session, HttpServletRequest request){
        return loginService.login(rUser,session,request);
    }


    /**
     * 注销
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public Result logout(HttpSession session){
        session.invalidate();
        return new Result(false,"注销成功");
    }


    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public Result register(@RequestBody RUser rUser ,HttpSession session,HttpServletRequest request){
        return loginService.register(rUser,session,request);
    }

    /**
     * 修改密码
     * @param session
     * @param oPass
     * @param nPass
     * @return
     */
    @RequestMapping(value = "/modify/pass",method = RequestMethod.GET)
    public Result register(HttpSession session, String oPass, String nPass){
        return loginService.pass(session,oPass,nPass);
    }

}
