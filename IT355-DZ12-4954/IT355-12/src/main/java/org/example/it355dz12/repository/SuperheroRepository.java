package org.example.it355dz12.repository;

import org.example.it355dz12.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {

    List<Superhero> findByHeightCmGreaterThan(int height);

}
