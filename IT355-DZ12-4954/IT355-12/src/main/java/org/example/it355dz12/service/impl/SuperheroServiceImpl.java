package org.example.it355dz12.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Superhero;
import org.example.it355dz12.repository.SuperheroRepository;
import org.example.it355dz12.service.SuperheroService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SuperheroServiceImpl implements SuperheroService {

    private final SuperheroRepository superheroRepository;

    @Override
    public List<Superhero> findAll() {
        return superheroRepository.findAll();
    }

    @Override
    public Optional<Superhero> findById(Integer id) {
        return superheroRepository.findById(id);
    }

    @Override
    public Superhero save(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public Superhero update(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public void deleteById(Integer id) {
        superheroRepository.deleteById(id);
    }

    @Override
    public List<Superhero> findByHeightCmGreaterThan(int height) {
        return superheroRepository.findByHeightCmGreaterThan(height);
    }
}
