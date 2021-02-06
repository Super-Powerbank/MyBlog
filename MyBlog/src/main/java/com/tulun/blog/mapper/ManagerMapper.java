package com.tulun.blog.mapper;

import com.tulun.blog.model.Manager;

import java.util.List;

public interface ManagerMapper {
    public List<Manager>  selectAllManager();

    public Manager selectManagerByNameAndPass(Manager manager);

}
