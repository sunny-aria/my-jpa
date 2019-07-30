package com.example.demo.util.spring;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author sundf
 * @date 2019-07-18 15:19
 **/
@Component
public class MyApplistener implements ApplicationListener {
    @Autowired
    UserService userService;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
//        System.out.println("=====my application listener exec========");
    }
}
