package com.mqtt;

import org.eclipse.paho.mqttv5.client.IMqttMessageListener;
import org.eclipse.paho.mqttv5.common.MqttMessage;

class Mqtt5PostPropertyMessageListener implements IMqttMessageListener {

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        System.out.println("reply topic  : " + topic);
        System.out.println("reply payload: " + message.toString());
    }
}
