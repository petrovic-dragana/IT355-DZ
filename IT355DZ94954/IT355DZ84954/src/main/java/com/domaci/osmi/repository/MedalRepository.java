package com.domaci.osmi.repository;

import com.domaci.osmi.model.Medal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MedalRepository extends JpaRepository<Medal, Integer> {

    List<Medal> findByYear(int year); // Pronalazi sve medalje osvojene u određenoj godini

    List<Medal> findBySport(String sport);
    // Pronalazi sve medalje osvojene u određenom sportu
    List<Medal> findByMedalName(String medalName);

}
