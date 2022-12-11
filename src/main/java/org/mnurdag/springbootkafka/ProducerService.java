package org.mnurdag.springbootkafka;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProducerService {

    KafkaTemplate<String, String> kafkaTemplate;

    public void send(String kafkaTopicName, String message) {

        kafkaTemplate.send(kafkaTopicName, message);
    }

}

