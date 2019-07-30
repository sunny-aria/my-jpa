package com.example.demo.util.rabbitmq;


import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * rabbitmq 工具类
 * @author hd
 * @date 2019-5-22 20：36
 */
@Slf4j
public class RabbitMqUtil {


    public static Connection getConnection(){
        String host = "127.0.0.1";
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setVirtualHost("myrabbit");
        factory.setUsername("test");
        factory.setPassword("test");
        factory.setPort(5672);
        try {
            return factory.newConnection();
        } catch (IOException e) {
            System.err.println("get rbmq error."+e.getMessage());
        } catch (TimeoutException e) {
            System.err.println("get rbmq error."+e.getMessage());
        }
        return null;
    }

}
