package com.example.login.controller;

import com.example.login.domain.User;
import com.example.login.service.UserService;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

//class UserControllerTest {
//    @Autowired
//    private UserService userService;
//
////    @Test
//    public void testLoginFail(){
//        User user=new User();
//        user.setUsername("zj");
//        user.setPassword("123");
//        String token=userService.login(user);
//        TestCase.assertTrue(token==null);
//    }
////    @Test
//    public void testLoginSuccess(){
//        User user=new User();
//        user.setUsername("dingtao");
//        user.setPassword("12345");
//        String token=userService.login(user);
//        TestCase.assertTrue(token==null);
//    }
//}