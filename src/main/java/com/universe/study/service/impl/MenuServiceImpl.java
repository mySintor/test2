package com.universe.study.service.impl;

import com.universe.study.entity.Menu;
import com.universe.study.mapper.MenuMapper;
import com.universe.study.service.IMenuService;
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
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements IMenuService {

    private final MenuMapper menuMapper;

    @Autowired
    public MenuServiceImpl(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    @Override
    protected MyBaseMapper<Menu> getMapper() {
        return menuMapper;
    }

    @Override
    public List<Menu> getMenu(){
        return menuMapper.getMenu();
    }

    @Override
    public List<Menu> getByRoleId(Integer roleId) {
        return menuMapper.getByRoleId(roleId);
    }
    @Override
    public List<Menu> getByUserId(Integer userId){
        return menuMapper.getByUserId(userId);
    }
}