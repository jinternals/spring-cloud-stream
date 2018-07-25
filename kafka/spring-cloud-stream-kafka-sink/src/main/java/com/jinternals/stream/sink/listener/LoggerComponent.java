package com.jinternals.stream.sink.listener;

import com.jinternals.stream.sink.configuration.DemoStreams;
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
