package com.example.infractioncommandservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@Slf4j
@RequestMapping("/commands")
@CrossOrigin("*")
public class InfractionCommandController {
    private EventStore eventStore;

    public InfractionCommandController(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    @GetMapping("/events/{infractionId}")
    public Stream eventsStream(@PathVariable String infractionId){
        return eventStore.readEvents(infractionId).asStream();
    }
}
