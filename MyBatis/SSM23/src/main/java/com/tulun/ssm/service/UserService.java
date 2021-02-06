package com.tulun.ssm.service;

import com.tulun.ssm.dao.UserMapper;
import com.tulun.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通过注解形式来完成依赖注入和Bean管理
 */

@Service
public class UserService {

    //将dao层对象注入到service层
    @Autowired
    UserMapper userMapper;

    public List<User> allUsers(){
        return userMapper.selectAllUser();
    }
}