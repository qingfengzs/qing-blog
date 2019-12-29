package com.qingfeng.qingblog.service.impl;

import com.qingfeng.qingblog.dao.CategoryMapper;
import com.qingfeng.qingblog.model.Category;
import com.qingfeng.qingblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category getCategoryById(Long id) {
        return categoryMapper.selectByPrimaryKey(id);

    }
}
