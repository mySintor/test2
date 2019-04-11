package com.universe.study.service;

import com.universe.study.entity.Role;

import java.util.List;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
public interface IRoleService extends IBaseService<Role>{
    List<Role> getByUserId(Integer userId);

}