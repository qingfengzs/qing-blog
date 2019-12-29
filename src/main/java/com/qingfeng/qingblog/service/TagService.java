package com.qingfeng.qingblog.service;

import com.qingfeng.qingblog.model.Tag;

public interface TagService {
    Tag getTagsByUserId(Long id);
}
