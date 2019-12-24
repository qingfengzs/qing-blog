package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.Tags;
import java.util.List;

public interface TagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tags record);

    Tags selectByPrimaryKey(Integer id);

    List<Tags> selectAll();

    int updateByPrimaryKey(Tags record);
}