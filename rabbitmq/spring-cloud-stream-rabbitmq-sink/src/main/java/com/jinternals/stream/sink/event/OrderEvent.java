package com.jinternals.stream.sink.event;

public class OrderEvent {

    private String id;
    private String name;

    public OrderEvent() {
    }

    public OrderEvent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
