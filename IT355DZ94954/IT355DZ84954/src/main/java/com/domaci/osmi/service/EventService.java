package com.domaci.osmi.service;

import com.domaci.osmi.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> findAll();
    Optional<Event> findById(Integer eventId);
    Event save(Event event);
    Event update (Event event);
    void deleteById(Integer eventId);
    List<Event> findByEventName(String eventName);
}
