package org.example.it355dz07.repository;


import org.example.it355dz07.model.Jelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JeloRepository extends JpaRepository<Jelo, Long> {
    Optional<List<Jelo>> findAllByNaziv(String naziv);
}
