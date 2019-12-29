package com.qingfeng.qingblog.controller;

import com.qingfeng.qingblog.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/article")
public class ArticleController extends BaseController {

    @GetMapping("/getone")
    public ResultVO getArticleById(Long id){
        return null;
    }
}
