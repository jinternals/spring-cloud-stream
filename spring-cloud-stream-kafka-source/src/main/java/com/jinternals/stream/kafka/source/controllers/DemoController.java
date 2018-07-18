package com.jinternals.stream.kafka.source.controllers;

import com.jinternals.stream.kafka.source.event.DemoEvent;
import com.jinternals.stream.kafka.source.event.OrderEvent;
import com.jinternals.stream.kafka.source.service.DemoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.HttpStatus.ACCEPTED;


@RestController
public class DemoController{

   private DemoSourceService demoSourceService;

   @Autowired
   public DemoController(DemoSourceService demoSourceService){
       this.demoSourceService = demoSourceService;
   }

    @GetMapping("/message")
    @ResponseStatus(ACCEPTED)
    public void demo(@RequestParam("message")String message) {
        this.demoSourceService.send(new DemoEvent(UUID.randomUUID().toString(), message));
    }


    @GetMapping("/order")
    @ResponseStatus(ACCEPTED)
    public void ordrer(@RequestParam("name")String name) {
        this.demoSourceService.send(new OrderEvent(UUID.randomUUID().toString(), name));
    }


}