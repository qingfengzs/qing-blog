package com.qingfeng.qingblog.service;

import com.qingfeng.qingblog.model.Article;
import com.qingfeng.qingblog.model.ArticleWithBLOBs;

public interface ArticleService {

    ArticleWithBLOBs getArticleById(Integer id);
}
