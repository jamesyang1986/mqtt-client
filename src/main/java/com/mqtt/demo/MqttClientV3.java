package com.mqtt.demo;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.concurrent.atomic.AtomicInteger;

public class MqttClientV3 {
    private String host;
    private int port;

    private MqttClient client;

    private AtomicInteger curId = new AtomicInteger(1000);

    public MqttClientV3(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect(String userName, String passWord) {
        if (client != null)
            return;

        String HOST = "tcp://" + host + ":" + port;

        String clientid = "subClient2";

        try {
            client = new MqttClient(HOST, clientid, new MemoryPersistence());
            // MQTT的连接设置
            MqttConnectOptions options = new MqttConnectOptions();
            // 设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，这里设置为true表示每次连接到服务器都以新的身份连接
            options.setCleanSession(true);
            // 设置连接的用户名
            options.setUserName(userName);
            // 设置连接的密码
            options.setPassword(passWord.toCharArray());
            // 设置超时时间 单位为秒
            options.setConnectionTimeout(10);

            options.setKeepAliveInterval(20);

            // 设置回调函数
            client.setCallback(new MqttCallback() {

                @Override
                public void connectionLost(Throwable throwable) {
                    System.out.println("receive error.");
                }

                @Override
                public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
                    System.out.println("receive mqttMessage:" + mqttMessage.toString());
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
                    System.out.println("deliveryComplete:" + iMqttDeliveryToken.getMessageId());
                }
            });

            client.connect(options);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void sendMsg(String topic, byte[] payload) throws MqttException {
        MqttMessage message = new MqttMessage();
        message.setId(curId.getAndIncrement());
        message.setQos(0);
        message.setRetained(false);
        message.setPayload(payload);
        client.publish(topic, message);
    }

    public void close() throws MqttException {
        client.disconnect();
        client.close();
    }

}
