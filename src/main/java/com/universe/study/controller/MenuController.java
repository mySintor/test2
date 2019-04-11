package com.universe.study.controller;

import com.universe.study.service.IMenuService;
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
@RequestMapping("menu")
public class MenuController {
    private final IMenuService menuService;

    @Autowired
    public MenuController(IMenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping("getMenu")
    public Object getMenu(){
        return menuService.getMenu();
    }

    @RequestMapping("getByRoleId")
    public Object getByRoleId(@RequestParam Integer roleId){
        return menuService.getByRoleId(roleId);
    }
    @RequestMapping("getByUserId")
    public Object getByUserId(){
        return menuService.getMenu();
    }
}