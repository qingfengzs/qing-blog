package com.qingfeng.qingblog.service.impl;

import com.qingfeng.qingblog.dao.RolesMapper;
import com.qingfeng.qingblog.model.Roles;
import com.qingfeng.qingblog.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RolesMapper rolesMapper;

    @Override
    public Roles getRoleById(Integer id) {
        return rolesMapper.selectByPrimaryKey(id);
    }
}
