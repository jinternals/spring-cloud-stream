package com.jinternals.stream.kafka.source.service;

import com.jinternals.stream.kafka.source.configuration.DemoStreams;
import static org.springframework.messaging.support.MessageBuilder.withPayload;

import com.jinternals.stream.kafka.source.event.DemoEvent;
import com.jinternals.stream.kafka.source.event.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoSourceService{

    private DemoStreams demoStreams;

    @Autowired
    public DemoSourceService(DemoStreams demoStreams){

        this.demoStreams = demoStreams;
    }

    public void send(DemoEvent demoEvent){
        this.demoStreams.output()
                .send(withPayload(demoEvent).setHeader("routing_id",demoEvent.getId()).build());
    }

    public void send(OrderEvent orderEvent){
        this.demoStreams.output()
                .send(withPayload(orderEvent).setHeader("routing_id",orderEvent.getId()).build());
    }

}