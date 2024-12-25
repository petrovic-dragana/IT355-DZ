package org.example.it355dz12.service;

import org.example.it355dz12.model.Attribute;

import java.util.List;
import java.util.Optional;

public interface AttributeService {

    List<Attribute> findAll();

    Optional<Attribute> findById(Integer id);

    Attribute save(Attribute attribute);

    Attribute update(Attribute attribute);

    void deleteById(Integer id);

}
