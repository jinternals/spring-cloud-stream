package com.jinternals.stream.source.event.publisher;

import com.jinternals.stream.source.configuration.Source;
import com.jinternals.stream.source.event.BaseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static org.springframework.messaging.support.MessageBuilder.withPayload;

@Component
public class EventPublisher {

    private Source source;

    @Autowired
    public EventPublisher(Source source) {
        this.source = source;
    }

    public void publishEvent(BaseEvent<?> event) {

        Message<? extends BaseEvent<?>> eventMessage = withPayload(event)
                .setHeader("routing_id", event.getId())
                .setHeader("type", event.getClass().getName())
                .build();

        this.source
                .outputChannel()
                .send(eventMessage);
    }

}
