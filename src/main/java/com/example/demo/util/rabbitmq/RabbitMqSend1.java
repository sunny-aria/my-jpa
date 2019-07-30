package com.example.demo.util.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMqSend1 {
    private  static String QUEUE = "queue_1";
    public static void main(String[] args) throws IOException {
        Connection connection = RabbitMqUtil.getConnection();

        try (Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE,false,false,false,null);
            channel.basicPublish("",QUEUE,null," {queue_1} :hello rbmq!".getBytes());
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }

    }
}
