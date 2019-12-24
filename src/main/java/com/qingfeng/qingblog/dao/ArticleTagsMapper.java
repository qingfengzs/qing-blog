package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.ArticleTags;
import java.util.List;

public interface ArticleTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTags record);

    ArticleTags selectByPrimaryKey(Integer id);

    List<ArticleTags> selectAll();

    int updateByPrimaryKey(ArticleTags record);
}