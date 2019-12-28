package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.ArticleView;

public interface ArticleViewMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleView record);

    int insertSelective(ArticleView record);

    ArticleView selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleView record);

    int updateByPrimaryKey(ArticleView record);
}