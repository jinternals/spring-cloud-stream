package com.jinternals.stream.kafka.source.event;

public class DemoEvent implements BaseEvent<String> {

    private String id;
    private String message;

    public DemoEvent(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}