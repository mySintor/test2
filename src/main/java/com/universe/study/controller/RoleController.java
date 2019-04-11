package com.universe.study.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.universe.study.entity.Role;
import com.universe.study.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@RestController
@RequestMapping("role")
public class RoleController {
    private final IRoleService roleService;


    @Autowired
    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("getPage")
    public Object getPage(@RequestParam int pageNum, @RequestParam int pageSize) {
        Page<Role> page = PageHelper.startPage(pageNum, pageSize);
        roleService.selectAll();
        return new PageInfo<>(page);
    }

    @RequestMapping("getList")
    public Object getList(@RequestParam Integer userId) {
        return roleService.getByUserId(userId);
    }
}