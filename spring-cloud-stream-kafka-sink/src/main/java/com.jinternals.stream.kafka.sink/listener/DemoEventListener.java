package com.jinternals.stream.kafka.sink.listener;

import com.jinternals.stream.kafka.sink.configuration.DemoStreams;
import com.jinternals.stream.kafka.sink.event.DemoEvent;
import com.jinternals.stream.kafka.sink.event.OrderEvent;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class DemoEventListener {

    @StreamListener(value = DemoStreams.INPUT, condition="headers['type']=='com.jinternals.stream.kafka.source.event.DemoEvent'")
    public void handle(DemoEvent demoEvent) {
        System.out.println("Message Received: " + demoEvent);
    }

    @StreamListener(value = DemoStreams.INPUT, condition="headers['type']=='com.jinternals.stream.kafka.source.event.OrderEvent'")
    public void handle(OrderEvent demoEvent) {
        System.out.println("Order Received: " + demoEvent);
    }
}
