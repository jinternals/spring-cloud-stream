package com.jinternals.stream.source.event.publisher;

import com.jinternals.stream.source.configuration.Source;
import com.jinternals.stream.source.event.DemoEvent;
import com.jinternals.stream.source.event.OrderEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.messaging.Message;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= RANDOM_PORT)
public class EventPublisherTest {

    @Autowired
    private Source source;

    @Autowired
    private EventPublisher eventPublisher;

    @Autowired
    private MessageCollector collector;

    @Test
    @SuppressWarnings("unchecked")
    public void shouldPublishMessageWithCorrectHeaderAndBody() {

        OrderEvent event = new OrderEvent("some-id","my message");
        eventPublisher.publishEvent(event);

       Message<?> messages = collector.forChannel(source.outputChannel()).poll();

        assertThat(messages).isNotNull();
        assertThat(messages.getHeaders()).containsKey("routing_id");
        assertThat(messages.getHeaders().get("routing_id")).isEqualTo(event.getId());
        assertThat(messages.getHeaders()).containsKey("type");
        assertThat(messages.getHeaders().get("type")).isEqualTo(event.getClass().getName());
        assertThat(messages.getPayload()).isEqualTo("{\"id\":\"some-id\",\"name\":\"my message\"}");
    }


}