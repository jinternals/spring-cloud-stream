package com.jinternals.stream.kafka.sink.configuration;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Primary;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

@Primary
public interface DemoStreams {

    public static String INPUT = "demo";

    @Input(INPUT)
    public SubscribableChannel subscribableChannel();

}

