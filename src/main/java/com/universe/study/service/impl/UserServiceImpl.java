package com.universe.study.service.impl;

import com.universe.study.entity.User;
import com.universe.study.mapper.UserMapper;
import com.universe.study.service.IUserService;
import com.universe.study.utils.MyBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    protected MyBaseMapper<User> getMapper() {
        return userMapper;
    }

    @Override
    public User login(String account, String password) {
        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        return userMapper.selectOne(user);
    }
}