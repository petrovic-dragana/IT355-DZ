package com.domaci.osmi.repository;

import com.domaci.osmi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByFullName(String fullName);
    List<Person> findByHeight(int height);
    List<Person> findByHeightBetween( int min, int max);
    List<Person> findByWeightOrHeight(int weight, int min, int max);
}
