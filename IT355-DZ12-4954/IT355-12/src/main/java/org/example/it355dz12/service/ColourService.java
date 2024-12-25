package org.example.it355dz12.service;

import org.example.it355dz12.model.Colour;

import java.util.List;
import java.util.Optional;

public interface ColourService {

    List<Colour> findAll();

    Optional<Colour> findById(Integer id);

    Colour save(Colour colour);

    Colour update(Colour colour);

    void deleteById(Integer id);

}
