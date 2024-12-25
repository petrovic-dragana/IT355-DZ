package org.example.it355dz07.repository;


import org.example.it355dz07.model.Restoran;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestoranRepository extends JpaRepository<Restoran, Long> {
    List<Restoran> findTop5ByOrderByOcenaDesc();

}
