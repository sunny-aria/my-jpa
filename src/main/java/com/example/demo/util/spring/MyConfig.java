package com.example.demo.util.spring;

import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 *
 * @author sundf
 * @date 2019-07-30 16:05
 **/
@Configuration
public class MyConfig {

    @Bean
    public Map<String, UserService> userServiceMap(){
        Map<String,UserService> map = new HashMap<>(4);
        map.put("one",MyApplicationContextAware.applicationContext.getBean(UserServiceImpl.class));
        return map;
    }
}
