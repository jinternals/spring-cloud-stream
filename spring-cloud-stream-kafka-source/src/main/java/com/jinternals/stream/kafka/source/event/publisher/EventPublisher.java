package com.jinternals.stream.kafka.source.event.publisher;

import com.jinternals.stream.kafka.source.configuration.SourceStreams;
import com.jinternals.stream.kafka.source.event.BaseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static org.springframework.messaging.support.MessageBuilder.withPayload;

@Component
public class EventPublisher {

    private SourceStreams sourceStreams;

    @Autowired
    public EventPublisher(SourceStreams sourceStreams) {
        this.sourceStreams = sourceStreams;
    }

    public void publishEvent(BaseEvent<?> event) {

        Message<? extends BaseEvent<?>> eventMessage = withPayload(event)
                .setHeader("routing_id", event.getId())
                .setHeader("type", event.getClass().getName())
                .build();

        this.sourceStreams
                .outputMessageChannel()
                .send(eventMessage);
    }

}
