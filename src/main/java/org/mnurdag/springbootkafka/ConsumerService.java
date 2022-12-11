package org.mnurdag.springbootkafka;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ConsumerService {

    @KafkaListener(topics = KafkaTopic.SAMPLE_MESSAGE_TOPIC, groupId = KafkaGroups.SAMPLE_GROUP)
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}

