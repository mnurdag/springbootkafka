package org.mnurdag.springbootkafka;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka/")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Controller {

    ProducerService producerService;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message) {
        producerService.send(KafkaTopic.SAMPLE_MESSAGE_TOPIC, message);

        return "Message sent to the Kafka Topic sample_message_topic successfully.";
    }

}
