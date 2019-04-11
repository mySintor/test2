package com.universe.study.service;

import com.universe.study.entity.User;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
public interface IUserService extends IBaseService<User>{
    User login(String account, String password);
}