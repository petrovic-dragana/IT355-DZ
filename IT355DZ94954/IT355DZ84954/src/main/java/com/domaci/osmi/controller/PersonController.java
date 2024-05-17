package com.domaci.osmi.controller;

import com.domaci.osmi.model.Person;
import com.domaci.osmi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable Integer id) {
        return personService.findById(id);
    }

    @GetMapping("/fullName/{fullName}")
    public List<Person> getPersonsByFullName(@PathVariable String fullName) {
        return personService.findByFullName(fullName);
    }

    @GetMapping("/height/{height}")
    public List<Person> getPersonsByHeight(@PathVariable int height) {
        return personService.findByHeight(height);
    }

    @GetMapping("/heightBetween/{min}/{max}")
    public List<Person> getPersonsByHeightBetween(@PathVariable int min, @PathVariable int max) {
        return personService.findByHeightBetween(min, max);
    }

    @GetMapping("/weightOrHeight/{weight}/{min}/{max}")
    public List<Person> getPersonsByWeightOrHeight(@PathVariable int weight, @PathVariable int min, @PathVariable int max) {
        return personService.findByWeightOrHeight(weight, min, max);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Integer id, @RequestBody Person person) {
        person.setId(id);
        return personService.update(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Integer id) {
        personService.deleteById(id);
    }
}
