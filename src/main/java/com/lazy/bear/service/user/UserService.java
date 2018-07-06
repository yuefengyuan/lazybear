package com.lazy.bear.service.user;

import com.lazy.bear.domain.User;

public interface UserService {

    public User getUserById(long userId) throws Exception;
}
