package org.example.it355dz12.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Attribute;
import org.example.it355dz12.repository.AttributeRepository;
import org.example.it355dz12.service.AttributeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttributeServiceImpl implements AttributeService {

    private final AttributeRepository attributeRepository;

    @Override
    public List<Attribute> findAll() {
        return attributeRepository.findAll();
    }

    @Override
    public Optional<Attribute> findById(Integer id) {
        return attributeRepository.findById(id);
    }

    @Override
    public Attribute save(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public Attribute update(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public void deleteById(Integer id) {
        attributeRepository.deleteById(id);
    }
}
