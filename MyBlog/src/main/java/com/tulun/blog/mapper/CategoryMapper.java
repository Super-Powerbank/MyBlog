package com.tulun.blog.mapper;

import com.tulun.blog.model.Category;

import java.util.List;

public interface CategoryMapper {
    public List<Category> selectAllCategorys();

    public Category selectCategoryById(Long id);
}
