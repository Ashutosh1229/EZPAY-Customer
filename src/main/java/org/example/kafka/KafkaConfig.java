package org.example.kafka;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static org.example.Helper.Constants.*;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = KAFKA_TOPIC, groupId = GROUP_ID)
    public void adMessage(String message){
        System.out.println(message);
    }
}
