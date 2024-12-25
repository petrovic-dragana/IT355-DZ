package org.example.it355dz12.service;

import org.example.it355dz12.model.Publisher;

import java.util.List;
import java.util.Optional;

public interface PublisherService {

    List<Publisher> findAll();

    Optional<Publisher> findById(Integer id);

    Publisher save(Publisher publisher);

    Publisher update(Publisher publisher);

    void deleteById(Integer id);

}
