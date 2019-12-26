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
        List<String> eventsIds = new ArrayList<>() {
            {
                add("5e0538a91a583c4259db443c");
                add("5e05385bd7d81f1aac724257");
                add("5e05351006672e000c3b85e8");
                add("5e0534f89e83bd59ccb12590");
            }
        };

        EventsIdsResponse response = new EventsIdsResponse();
        response.setEventsIds(eventsIds);
        return response;
    }
}
