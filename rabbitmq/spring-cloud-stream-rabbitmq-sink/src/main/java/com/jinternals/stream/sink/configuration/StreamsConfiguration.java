package com.jinternals.stream.sink.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(DemoStreams.class)
public class StreamsConfiguration {


}
