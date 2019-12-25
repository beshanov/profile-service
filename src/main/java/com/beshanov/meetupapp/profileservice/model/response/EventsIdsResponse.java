package com.beshanov.meetupapp.profileservice.model.response;

import java.util.List;

public class EventsIdsResponse {
    private List<Long> eventsIds;

    public List<Long> getEventsIds() {
        return eventsIds;
    }

    public void setEventsIds(List<Long> eventsIds) {
        this.eventsIds = eventsIds;
    }

    public EventsIdsResponse() {
    }
}
