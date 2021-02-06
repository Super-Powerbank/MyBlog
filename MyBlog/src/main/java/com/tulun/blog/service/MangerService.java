package com.tulun.blog.service;

import com.tulun.blog.mapper.ManagerMapper;
import com.tulun.blog.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangerService {
    @Autowired
    private ManagerMapper managerMapper;

    public List<Manager> getAllManagers(){
        return managerMapper.selectAllManager();
    }


    /**
     * 登录验证
     */
    public boolean checkNameAndPass(Manager manager){
        Manager manager1 = managerMapper.selectManagerByNameAndPass(manager);
        if (manager1 == null) {
            return false;
        } else {
            return true;
        }
    }
}
