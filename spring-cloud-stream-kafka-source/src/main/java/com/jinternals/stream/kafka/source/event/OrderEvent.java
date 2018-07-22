package com.jinternals.stream.kafka.source.event;

public class OrderEvent implements BaseEvent<String> {

    private String id;
    private String name;

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
