package com.example.login.dao;

import com.example.login.domain.User;

public interface UserMapper {
    int selectByUsernameAndPassword(User user);
}
