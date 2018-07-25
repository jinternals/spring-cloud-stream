package com.jinternals.stream.source.event;

public class OrderEvent implements BaseEvent<String> {

    private String id;
    private String name;

    public OrderEvent() {
    }

    public OrderEvent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
