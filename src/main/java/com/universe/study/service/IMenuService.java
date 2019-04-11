package com.universe.study.service;

import com.universe.study.entity.Menu;

import java.util.List;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
public interface IMenuService extends IBaseService<Menu> {
    List<Menu> getMenu();

    List<Menu> getByRoleId(Integer roleId);

    List<Menu> getByUserId(Integer userId);
}