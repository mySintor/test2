package com.universe.study.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.universe.study.entity.User;
import com.universe.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpSession;

/**
 * @author Sin auto
 * @date 2019/04/04/04:25
 */
@SuppressWarnings("unused")
@RestController
@RequestMapping("user")
public class UserController {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("getPage")
    public Object getPage(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String account) {
        System.out.println(account);
        Page<User> page = PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(User.class);
        example.createCriteria().andLike("account", "%" + account + "%");
        userService.selectByExample(example);
        return new PageInfo<>(page);
    }

    @RequestMapping("login")
    public Object login(@RequestParam String account, @RequestParam String password, HttpSession httpSession) {
        User user = userService.login(account, password);
        if (user != null) {
            httpSession.setAttribute("user", user);
            return true;
        } else {
            return false;
        }
    }

}