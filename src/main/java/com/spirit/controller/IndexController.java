package com.spirit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(HttpSession session){
        session.invalidate();
        return "index";
    }

    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String reg(){
        return "reg";
    }

    @RequestMapping(value = "/o",method = RequestMethod.GET)
    public String odort(){
        return "odort";
    }

    @RequestMapping(value = "/s",method = RequestMethod.GET)
    public String spirit(){
        return "spirit";
    }

    @RequestMapping(value = "/c",method = RequestMethod.GET)
    public String count(){
        return "count";
    }

    @RequestMapping(value = "/m",method = RequestMethod.GET)
    public String manufacturers(){
        return "manufacturers";
    }

    @RequestMapping(value = "/u",method = RequestMethod.GET)
    public String user(){
        return "user";
    }


}
