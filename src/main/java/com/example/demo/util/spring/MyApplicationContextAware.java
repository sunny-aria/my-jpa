package com.example.demo.util.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author sundf
 * @date 2019-07-30 14:58
 **/
@Component
public class MyApplicationContextAware implements ApplicationContextAware {

    public static ApplicationContext applicationContext ;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

}
