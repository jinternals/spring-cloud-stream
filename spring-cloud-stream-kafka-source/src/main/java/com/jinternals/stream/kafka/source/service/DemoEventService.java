package com.jinternals.stream.kafka.source.service;

import com.jinternals.stream.kafka.source.configuration.SourceStreams;
import static org.springframework.messaging.support.MessageBuilder.withPayload;

import com.jinternals.stream.kafka.source.event.DemoEvent;
import com.jinternals.stream.kafka.source.event.OrderEvent;
import com.jinternals.stream.kafka.source.event.publisher.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoEventService {

    private EventPublisher eventPublisher;

    @Autowired
    public DemoEventService(EventPublisher eventPublisher){
        this.eventPublisher = eventPublisher;
    }

    public void send(DemoEvent demoEvent){
        this.eventPublisher.publishEvent(demoEvent);
    }

    public void send(OrderEvent orderEvent){
        this.eventPublisher.publishEvent(orderEvent);
    }

}