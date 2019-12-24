package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.Roles;
import java.util.List;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    Roles selectByPrimaryKey(Integer id);

    List<Roles> selectAll();

    int updateByPrimaryKey(Roles record);
}