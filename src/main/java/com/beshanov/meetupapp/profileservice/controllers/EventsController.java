package com.beshanov.meetupapp.profileservice.controllers;

import com.beshanov.meetupapp.profileservice.model.response.EventsIdsResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventsController {

    @GetMapping("/events")
    public EventsIdsResponse getEventsForUser(@RequestParam String userId) {
        //идём в базу и находим все события, в которых участвует пользователь
        List<Long> eventsIds = new ArrayList<>() {
            {
                add(1001L);
                add(1002L);
                add(1003L);
                add(1004L);
            }
        };

        EventsIdsResponse response = new EventsIdsResponse();
        response.setEventsIds(eventsIds);
        return response;
    }
}
