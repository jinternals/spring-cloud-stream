package com.jinternals.stream.source.service;

import com.jinternals.stream.source.event.DemoEvent;
import com.jinternals.stream.source.event.OrderEvent;
import com.jinternals.stream.source.event.publisher.EventPublisher;
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