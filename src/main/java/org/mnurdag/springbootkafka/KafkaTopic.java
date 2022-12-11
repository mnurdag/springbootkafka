package org.mnurdag.springbootkafka;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KafkaTopic {
    public static final String SAMPLE_MESSAGE_TOPIC = "sample_message_topic";
}
