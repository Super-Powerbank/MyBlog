package com.tulun.blog.service;

import com.tulun.blog.mapper.CategoryMapper;
import com.tulun.blog.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> getAllCategorys(){
        return categoryMapper.selectAllCategorys();
    }

    public Category getCategoryById(Long id){
        return categoryMapper.selectCategoryById(id);
    }
}
