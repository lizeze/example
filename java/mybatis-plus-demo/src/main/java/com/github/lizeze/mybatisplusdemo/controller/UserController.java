package com.github.lizeze.mybatisplusdemo.controller;

import com.github.lizeze.mybatisplusdemo.bo.User;
import com.github.lizeze.mybatisplusdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：lzz
 * @BelongsProject: com.github.lizeze.mybatisplusdemo.controller
 * @date ：Created in 2020/9/4 16:33
 * @description ：
 * @modified By：
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> list() {

        return userService.list();

    }

}
