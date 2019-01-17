package com.spirit.service;

import com.spirit.entity.Result;
import com.spirit.pojo.RUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface LoginService {

    Result login(RUser rUser, HttpSession session, HttpServletRequest request);

    Result register(RUser rUser, HttpSession session,HttpServletRequest request);

    Result pass(HttpSession session,String oPass,String nPass);
}
