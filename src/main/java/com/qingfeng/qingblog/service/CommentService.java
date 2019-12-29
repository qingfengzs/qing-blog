package com.qingfeng.qingblog.service;

import com.qingfeng.qingblog.model.Comment;

public interface CommentService {
    Comment getCommentsByArticleId(Long id);
}
