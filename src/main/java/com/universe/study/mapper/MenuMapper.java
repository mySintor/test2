package com.universe.study.mapper;

import com.universe.study.entity.Menu;
import com.universe.study.utils.MyBaseMapper;

import java.util.List;

/**
 * @author Sin
 * @date 2019/04/04/02:17
 */
public interface MenuMapper extends MyBaseMapper<Menu> {
    List<Menu> getMenu();

    List<Menu> getByRoleId(Integer roleId);

    List<Menu> getByUserId(Integer userId);
}