package com.jinternals.stream.source.configuration;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Primary;
import org.springframework.messaging.MessageChannel;

@Primary
public interface SourceStreams {

    public static String OUTPUT_CHANNEL = "demo";

    @Output(OUTPUT_CHANNEL)
    public MessageChannel outputMessageChannel();

}

