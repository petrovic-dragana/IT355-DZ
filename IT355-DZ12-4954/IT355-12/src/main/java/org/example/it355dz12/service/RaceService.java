package org.example.it355dz12.service;

import org.example.it355dz12.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {

    List<Race> findAll();

    Optional<Race> findById(Integer id);

    Race save(Race race);

    Race update(Race race);

    void deleteById(Integer id);

}
