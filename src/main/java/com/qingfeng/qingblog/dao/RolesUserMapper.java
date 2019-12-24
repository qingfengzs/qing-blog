package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.RolesUser;
import java.util.List;

public interface RolesUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolesUser record);

    RolesUser selectByPrimaryKey(Integer id);

    List<RolesUser> selectAll();

    int updateByPrimaryKey(RolesUser record);
}