package com.qingfeng.qingblog.service.impl;

import com.qingfeng.qingblog.dao.ArticleMapper;
import com.qingfeng.qingblog.model.ArticleWithBLOBs;
import com.qingfeng.qingblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public ArticleWithBLOBs getArticleById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
