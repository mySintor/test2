package com.universe.study.mapper;

import com.universe.study.entity.Role;
import com.universe.study.utils.MyBaseMapper;

import java.util.List;

/**
 * @author Sin
 * @date 2019/04/04/02:17
 */
public interface RoleMapper extends MyBaseMapper<Role> {
    List<Role> getByUserId(Integer userId);
}