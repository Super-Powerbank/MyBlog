package com.tulun.ssm.dao;

import com.tulun.ssm.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectAllUser();
}
