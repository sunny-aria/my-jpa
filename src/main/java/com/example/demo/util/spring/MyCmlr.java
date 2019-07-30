package com.example.demo.util.spring;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 描述：applicationContext 创建完之后调用
 *
 * @author sundf
 * @date 2019-07-18 15:16
 **/
@Configuration
public class MyCmlr implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        System.out.println("=====my commandlineRunner exec=====");
    }
}
