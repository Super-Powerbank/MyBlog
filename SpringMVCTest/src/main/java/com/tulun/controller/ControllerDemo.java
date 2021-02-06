package com.tulun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 处理器
 */
@Controller
public class ControllerDemo {
    @RequestMapping("/hello")
    public String hello() {
        //返回ModelAndView对象
        //View的逻辑视图名:"/Web-INF/jsp/hello.jsp"
        return "hello";
    }

    @RequestMapping("/basedataType")
    public void baseDataType(int username) {
        System.out.println("基本数据类型："+username);
    }
}