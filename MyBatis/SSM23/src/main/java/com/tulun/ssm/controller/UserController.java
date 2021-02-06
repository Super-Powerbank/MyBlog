package com.tulun.ssm.controller;

import com.tulun.ssm.pojo.User;
import com.tulun.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    //将service层对象注入到Controller层
    @Autowired
    UserService userService;


    @RequestMapping("/index")
    public ModelAndView userList(){
        List <User> users = userService.allUsers();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("userList");
        return modelAndView;
    }
}