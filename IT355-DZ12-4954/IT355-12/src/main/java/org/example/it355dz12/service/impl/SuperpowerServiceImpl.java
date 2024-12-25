package org.example.it355dz12.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Superpower;
import org.example.it355dz12.repository.SuperpowerRepository;
import org.example.it355dz12.service.SuperpowerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SuperpowerServiceImpl implements SuperpowerService {

    private final SuperpowerRepository superpowerRepository;

    @Override
    public List<Superpower> findAll() {
        return superpowerRepository.findAll();
    }

    @Override
    public Optional<Superpower> findById(Integer id) {
        return superpowerRepository.findById(id);
    }

    @Override
    public Superpower save(Superpower superpower) {
        return superpowerRepository.save(superpower);
    }

    @Override
    public Superpower update(Superpower superpower) {
        return superpowerRepository.save(superpower);
    }

    @Override
    public void deleteById(Integer id) {
        superpowerRepository.deleteById(id);
    }
}
