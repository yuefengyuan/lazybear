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

    //@Autowired
    //UserService userService;

    @RequestMapping("/getuser")
    public User getUser() {

        User user = new User();

        user.setUserName("nick");

        return user;

    }

}
