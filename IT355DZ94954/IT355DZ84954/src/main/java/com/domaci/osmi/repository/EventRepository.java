package com.domaci.osmi.repository;

import com.domaci.osmi.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findByEventNaziv(String eventName);

}
