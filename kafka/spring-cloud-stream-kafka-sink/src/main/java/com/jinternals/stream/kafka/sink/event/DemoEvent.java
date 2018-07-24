package com.jinternals.stream.kafka.sink.event;

public class DemoEvent {

    private String id;
    private String message;

    public DemoEvent() {
    }

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


    @Override
    public String toString() {
        return "DemoEvent{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}