package com.universe.study.service.impl;

import com.universe.study.entity.UserRole;
import com.universe.study.mapper.UserRoleMapper;
import com.universe.study.service.IUserRoleService;
import com.universe.study.utils.MyBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@Service
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole> implements IUserRoleService {

    private final UserRoleMapper userRoleMapper;

    @Autowired
    public UserRoleServiceImpl(UserRoleMapper userRoleMapper) {
        this.userRoleMapper = userRoleMapper;
    }

    @Override
    protected MyBaseMapper<UserRole> getMapper() {
        return userRoleMapper;
    }
}