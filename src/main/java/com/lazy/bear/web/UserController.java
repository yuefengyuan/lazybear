package com.lazy.bear.web;

import com.lazy.bear.domain.User;
import com.lazy.bear.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getuser")
    public User getUser() throws Exception {

       /* User user = new User();

        user.setUserName("nick");

        user.setEmail("ayuelei@163.com");

        user.setId(123456L);

        user.setNickName("nickName");

        user.setPassWord("lyz");*/

       User user = userService.getUserById(1);

        return user;
    }



}
