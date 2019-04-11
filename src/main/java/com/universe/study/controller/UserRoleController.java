package com.universe.study.controller;

import com.universe.study.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@RestController
public class UserRoleController {
    private final IUserRoleService userRoleService;

    @Autowired
    public UserRoleController(IUserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

}