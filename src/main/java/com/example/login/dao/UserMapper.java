package com.example.login.dao;

import com.example.login.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {
    int selectByUsernameAndPassword(User user);
}
