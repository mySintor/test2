package com.universe.study.service.impl;

import com.universe.study.entity.Role;
import com.universe.study.mapper.RoleMapper;
import com.universe.study.service.IRoleService;
import com.universe.study.utils.MyBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements IRoleService {

    private final RoleMapper roleMapper;

    @Autowired
    public RoleServiceImpl(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @Override
    protected MyBaseMapper<Role> getMapper() {
        return roleMapper;
    }

    @Override
    public List<Role> getByUserId(Integer userId){
        return roleMapper.getByUserId(userId);
    }

}