package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
//    private Map<String,UserService> userServiceMap;
    UserService userService;

    @RequestMapping("/add")
    public String addUser(){
        User u = new User();
        u.setPassword("1233");
        u.setUsername("123");
        userService.addUser(u);
        return "success";
    }
}
