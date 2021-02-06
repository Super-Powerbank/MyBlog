package com.tulun.blog.controller;

import com.tulun.blog.model.Manager;
import com.tulun.blog.model.Result;
import com.tulun.blog.service.MangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    MangerService mangerService;


    @RequestMapping("/list")
    public ModelAndView managerList() {
        List <Manager> allManagers = mangerService.getAllManagers();
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("managers",allManagers);
        modelAndView.setViewName("managerlist");
        return modelAndView;
    }

    /**
     * 成功页面
     */
    @RequestMapping("/success")
    public String success() {
        return "/user/success";
    }


    /**
     * 登录页面
     */
    @RequestMapping("/login")
    public String login() {
        return "/user/login";
    }

    /**
     * 验证登录信息
     */
    @RequestMapping("/logininfo")
    public @ResponseBody Result loginInfo(Manager manager, HttpSession session){
        System.out.println("登录信息为："+manager);

        //到数据库匹配账号密码是否正确
        boolean checkNameAndPass = mangerService.checkNameAndPass(manager);
        if (checkNameAndPass) {
            //登录成功，记录session
            session.setAttribute("userInfo",manager);
            //登录成功
            return  new Result("success", "");
        } else {
            //登录失败
            return new Result("err","用户名或密码不正确");
        }
    }



}
