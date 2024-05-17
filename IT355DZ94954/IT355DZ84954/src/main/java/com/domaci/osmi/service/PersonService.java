package com.domaci.osmi.service;

import com.domaci.osmi.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();
    Optional <Person> findById(Integer personId);
    Person save(Person person);
    Person update(Person person);
    void deleteById(Integer personId);
    List<Person> findByFullName(String fullName);
    List<Person> findByHeight(int height);
    List<Person> findByHeightBetween (int min , int max);
    List<Person> findByWeightOrHeight(int weight, int min, int max);
}
