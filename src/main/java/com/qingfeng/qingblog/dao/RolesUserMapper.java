package com.qingfeng.qingblog.dao;

import com.qingfeng.qingblog.model.RolesUser;

public interface RolesUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolesUser record);

    int insertSelective(RolesUser record);

    RolesUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolesUser record);

    int updateByPrimaryKey(RolesUser record);
}