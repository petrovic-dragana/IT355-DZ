package org.example.it355dz12.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Colour;
import org.example.it355dz12.repository.ColourRepository;
import org.example.it355dz12.service.ColourService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColourServiceImpl implements ColourService {

    private final ColourRepository colourRepository;

    @Override
    public List<Colour> findAll() {
        return colourRepository.findAll();
    }

    @Override
    public Optional<Colour> findById(Integer id) {
        return colourRepository.findById(id);
    }

    @Override
    public Colour save(Colour colour) {
        return colourRepository.save(colour);
    }

    @Override
    public Colour update(Colour colour) {
        return colourRepository.save(colour);
    }

    @Override
    public void deleteById(Integer id) {
        colourRepository.deleteById(id);
    }
}
