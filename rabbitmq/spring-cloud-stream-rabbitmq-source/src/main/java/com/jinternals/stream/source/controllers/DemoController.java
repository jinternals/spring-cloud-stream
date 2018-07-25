package com.jinternals.stream.source.controllers;

import com.jinternals.stream.source.event.DemoEvent;
import com.jinternals.stream.source.event.OrderEvent;
import com.jinternals.stream.source.service.DemoEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.ACCEPTED;


@RestController
public class DemoController{

   private DemoEventService demoEventService;

   @Autowired
   public DemoController(DemoEventService demoEventService){
       this.demoEventService = demoEventService;
   }

    @PostMapping("/demo")
    @ResponseStatus(ACCEPTED)
    public void demo(@RequestBody DemoEvent event) {
        this.demoEventService.send(event);
    }


    @PostMapping("/order")
    @ResponseStatus(ACCEPTED)
    public void ordrer(@RequestBody OrderEvent orderEvent) {
        this.demoEventService.send(orderEvent);
    }


}