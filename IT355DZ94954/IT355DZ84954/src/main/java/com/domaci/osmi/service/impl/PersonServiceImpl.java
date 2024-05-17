package com.domaci.osmi.service.impl;


import com.domaci.osmi.model.Person;
import com.domaci.osmi.repository.PersonRepository;
import com.domaci.osmi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService  {


        private PersonRepository personRepository;

        @Override
        public List<Person> findAll() {
            return personRepository.findAll();
        }

        @Override
        public Optional<Person> findById(Integer personId) {
            return personRepository.findById(personId);
        }

        @Override
        public Person save(Person person) {
            return personRepository.save(person);
        }

        @Override
        public Person update(Person person) {
            Optional<Person> existingPerson = personRepository.findById(person.getId());
            if (existingPerson.isPresent()) {
                return personRepository.save(person);
            } else {
                throw new RuntimeException("Person not found with id: " + person.getId());
            }
        }

        @Override
        public void deleteById(Integer personId) {
            personRepository.deleteById(personId);
        }

        @Override
        public List<Person> findByFullName(String fullName) {
            return personRepository.findByFullName(fullName);
        }

        @Override
        public List<Person> findByHeight(int height) {
            return personRepository.findByHeight(height);
        }

        @Override
        public List<Person> findByHeightBetween(int min, int max) {
            return personRepository.findByHeightBetween(min, max);
        }

        @Override
        public List<Person> findByWeightOrHeight(int weight, int min, int max) {
            return personRepository.findByWeightOrHeight(weight, min, max);
        }


}
