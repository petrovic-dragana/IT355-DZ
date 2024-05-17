package com.domaci.osmi.service.impl;

import com.domaci.osmi.model.Event;
import com.domaci.osmi.repository.EventRepository;
import com.domaci.osmi.service.EventService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> findById(Integer eventId) {
        return eventRepository.findById(eventId);
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event update(Event event) {
        if (event.getId() != null && eventRepository.existsById(event.getId())) {
            return eventRepository.save(event);
        } else {
            throw new RuntimeException("Event not found with id: " + event.getId());
        }
    }

    @Override
    public void deleteById(Integer eventId) {
        eventRepository.deleteById(eventId);
    }

    @Override
    public List<Event> findByEventName(String eventName) {
        return eventRepository.findByEventName(eventName);
    }
}
