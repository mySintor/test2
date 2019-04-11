package com.universe.study.service.impl;

import com.universe.study.entity.RoleMenu;
import com.universe.study.mapper.RoleMenuMapper;
import com.universe.study.service.IRoleMenuService;
import com.universe.study.utils.MyBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@Service
public class RoleMenuServiceImpl extends BaseServiceImpl<RoleMenu> implements IRoleMenuService {

    private final RoleMenuMapper roleMenuMapper;

    @Autowired
    public RoleMenuServiceImpl(RoleMenuMapper roleMenuMapper) {
        this.roleMenuMapper = roleMenuMapper;
    }

    @Override
    protected MyBaseMapper<RoleMenu> getMapper() {
        return roleMenuMapper;
    }
}