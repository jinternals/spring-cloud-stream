package com.jinternals.stream.sink.listener;

import com.jinternals.stream.sink.configuration.DemoStreams;
import com.jinternals.stream.sink.event.DemoEvent;
import com.jinternals.stream.sink.event.OrderEvent;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class DemoEventListener {

    @StreamListener(value = DemoStreams.INPUT, condition="headers['type']=='com.jinternals.stream.source.event.DemoEvent'")
    public void handle(DemoEvent demoEvent) {
        System.out.println("Message Received: " + demoEvent);
    }

    @StreamListener(value = DemoStreams.INPUT, condition="headers['type']=='com.jinternals.stream.source.event.OrderEvent'")
    public void handle(OrderEvent demoEvent) {
        System.out.println("Order Received: " + demoEvent);
    }
}
