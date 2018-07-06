package com.lazy.bear.service.user.impl;

import com.lazy.bear.dao.UserMapper;
import com.lazy.bear.domain.User;
import com.lazy.bear.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(long userId) throws Exception {

        return userMapper.selectByPrimaryKey(userId);
    }
}
