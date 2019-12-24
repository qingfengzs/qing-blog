package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.Pv;
import java.util.List;

public interface PvMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pv record);

    Pv selectByPrimaryKey(Integer id);

    List<Pv> selectAll();

    int updateByPrimaryKey(Pv record);
}