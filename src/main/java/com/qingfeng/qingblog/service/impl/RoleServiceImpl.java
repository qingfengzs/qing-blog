package com.qingfeng.qingblog.service.impl;

import com.qingfeng.qingblog.dao.RoleMapper;
import com.qingfeng.qingblog.model.Role;
import com.qingfeng.qingblog.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper rolesMapper;

    @Override
    public Role getRoleById(Integer id) {
        return rolesMapper.selectByPrimaryKey(id);
    }
}
