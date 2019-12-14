package com.redbean.test.user.controller;

import com.redbean.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("login")
    public void test1(){

    }



}
