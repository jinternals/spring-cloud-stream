package com.jinternals.stream.kafka.sink.listener;

import com.jinternals.stream.kafka.sink.configuration.DemoStreams;
import com.jinternals.stream.kafka.sink.event.DemoEvent;
import com.jinternals.stream.kafka.sink.event.OrderEvent;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class LoggerComponent {


    @StreamListener(DemoStreams.INPUT)
    public void handle(Message message) {
        System.out.println("Message Received: " + message);
    }


}
