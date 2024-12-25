package org.example.it355dz12.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.HeroAttribute;
import org.example.it355dz12.repository.HeroAttributeRepository;
import org.example.it355dz12.service.HeroAttributeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HeroAttributeServiceImpl implements HeroAttributeService {

    private final HeroAttributeRepository heroAttributeRepository;

    @Override
    public List<HeroAttribute> findAll() {
        return heroAttributeRepository.findAll();
    }

    @Override
    public Optional<HeroAttribute> findById(Integer id) {
        return heroAttributeRepository.findById(id);
    }

    @Override
    public HeroAttribute save(HeroAttribute heroAttribute) {
        return heroAttributeRepository.save(heroAttribute);
    }

    @Override
    public HeroAttribute update(HeroAttribute heroAttribute) {
        return heroAttributeRepository.save(heroAttribute);
    }

    @Override
    public void deleteById(Integer id) {
        heroAttributeRepository.deleteById(id);
    }
}
