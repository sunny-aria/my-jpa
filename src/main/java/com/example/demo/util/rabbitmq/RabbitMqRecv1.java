package com.example.demo.util.rabbitmq;

import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Slf4j
public class RabbitMqRecv1 {

    private  static String QUEUE = "queue_1";
    public static void main(String[] args) throws IOException {
        Connection connection = RabbitMqUtil.getConnection();

        try (Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE,false,false,false,null);

            channel.basicConsume(QUEUE, new DefaultConsumer(channel) {

                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    System.out.println((new String(body)));
                }
            });
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }

    }
}
