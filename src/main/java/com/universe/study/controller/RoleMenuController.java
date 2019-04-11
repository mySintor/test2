package com.universe.study.controller;

import com.universe.study.entity.RoleMenu;
import com.universe.study.service.IRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@RestController
@RequestMapping("roleMenu")
public class RoleMenuController {
    private final IRoleMenuService roleMenuService;

    @Autowired
    public RoleMenuController(IRoleMenuService roleMenuService) {
        this.roleMenuService = roleMenuService;
    }

    @RequestMapping("deleteRoleMenu")
    public Object deleteRoleMenu(@RequestParam Integer roleId, @RequestParam Integer menuId) {
        Example example = new Example(RoleMenu.class);
        example.createCriteria()
                .andCondition("roleId=", roleId)
                .andCondition("menuId=",menuId);
        return roleMenuService.deleteByExample(example);
    }
}