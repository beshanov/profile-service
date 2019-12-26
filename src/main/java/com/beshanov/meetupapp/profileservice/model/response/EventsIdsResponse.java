package com.beshanov.meetupapp.profileservice.model.response;

import java.util.List;

public class EventsIdsResponse {
    private List<String> eventsIds;

    public List<String> getEventsIds() {
        return eventsIds;
    }

    public void setEventsIds(List<String> eventsIds) {
        this.eventsIds = eventsIds;
    }

    public EventsIdsResponse() {
    }
}
