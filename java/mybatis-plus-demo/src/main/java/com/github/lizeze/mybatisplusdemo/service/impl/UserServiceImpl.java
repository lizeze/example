package com.github.lizeze.mybatisplusdemo.service.impl;

import com.github.lizeze.mybatisplusdemo.bo.User;
import com.github.lizeze.mybatisplusdemo.mapper.UserMapper;
import com.github.lizeze.mybatisplusdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：lzz
 * @BelongsProject: com.github.lizeze.mybatisplusdemo.service.impl
 * @date ：Created in 2020/9/4 16:17
 * @description ：
 * @modified By：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.selectList(null);
    }
}
