package com.tulun.controller;

import com.tulun.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/index")
    public String index() {
        return "user";
    }


//    @RequestMapping("/adduser")
//    //接收自定义类型的数据
//    public String addUser(User user){
//        System.out.println("用户信息："+user);
//        return "success";
//    }

@RequestMapping("/adduser")
//接收自定义类型的数据
public String addUser(User user){
    System.out.println("用户信息："+user);
    //添加用户成功跳转到用户列表
    //redirect进行页面重定向
//    return "redirect:/user/userlist";
    return "forward:/user/userlist";
}

    @RequestMapping("/userlist")
    //集合类型数据的传递
    public ModelAndView userList() {


        ModelAndView modelAndView = new ModelAndView();
        //指定逻辑视图名
        modelAndView.setViewName("userlist");

        //伪数据集合
        ArrayList<User> users = new ArrayList <>();
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAddress("陕西西安");
        users.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("李四");
        user2.setAddress("陕西西安");
        users.add(user2);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("王五");
        user3.setAddress("陕西西安");
        users.add(user3);

        //填充数据
        modelAndView.addObject("users", users);
        modelAndView.addObject("class", "超大充电宝");

        return modelAndView;
    }
}