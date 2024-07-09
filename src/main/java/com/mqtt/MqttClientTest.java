package com.mqtt;

import com.mqtt.client.model.ChatMsg;
import com.mqtt.demo.MqttClientV3;
import com.mqtt.util.JsonUtils;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class MqttClientTest {
    private static Map<String, String> userConfigMap = new HashMap();

    static {
        userConfigMap.put("10000", "user1");
        userConfigMap.put("10001", "user2");
    }

    public static void main(String[] args) {
        String from = "10000";
        String to = "10001";
        if (args != null && args.length >= 2) {
            from = args[0];
            to = args[1];
        }

        String host = "127.0.0.1";
        int port = 7001;

        if (args != null && args.length >= 4) {
            host = args[2];
            port = Integer.parseInt(args[3]);
        }

        System.out.println("start the connect the mqtt server, the server host is:"
                + host + ", port:" + port);

        MqttClientV3 clientV2 = new MqttClientV3(host, port);
        clientV2.connect(userConfigMap.get(from), "test");
        System.out.println("finish connect");

        try {
            Thread.sleep(15 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sendMsg(from, to, clientV2);

        try {
            Thread.sleep(1000000);
            clientV2.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendMsg(String from, String to, MqttClientV3 clientV2) {
        for (int i = 0; i < 10; i++) {
            Map<String, Object> bodyMap = new HashMap<>();
            bodyMap.put("content", "hello:" + i);
            try {
                ChatMsg msg = new ChatMsg();
                msg.setFrom(from);
                msg.setTo(to);
                msg.setTime(System.currentTimeMillis());
                msg.setBody(bodyMap);

                clientV2.sendMsg("/PT/" + "/wchat" + "/" + from + "/" + to
                        , JsonUtils.toJSON(msg)
                                .getBytes(StandardCharsets.UTF_8));
                System.out.println("send msg:" + i);

            } catch (MqttException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
