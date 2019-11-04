package com.dr.rabbitmq.helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

public class Send {
    private final static String QUEUE_NAME = "hello";//the name of the queue

    public static void main(String[] argv) throws Exception {
        //create a connection to the server
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        //Connection抽象了socket连接，并为我们负责协议版本协商和身份验证等。
        // 这里我们连接到本地机器上的broker - 参数是localhost。
        // 如果我们想要连接到不同机器上的broker，我们只需在此处指定其名称或IP地址
        try (Connection connection = factory.newConnection();
        //接下来，我们创建一个channel，这是完成broker任务的大部分API所在的位置。
        // 注意我们可以使用try-with-resources语句，因为Connection和Channel都实现了java.io.Closeable接口。
        // 这样我们就不需要在代码中再去关闭它们
             Channel channel = connection.createChannel()) {
            //要发送消息，我们必须声明一个queue供我们发送;
            //声明了queue之后我们可以在try-with-resources语句中将消息发布到队列中
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + message + "'");
            //声明队列是幂等的 - 只有在它不存在的情况下才能够创建它。
            //消息内容是一个字节数组，因此可以编码我们想发送的任何内容。
        }
    }
}
