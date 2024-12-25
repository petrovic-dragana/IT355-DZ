package org.example.it355dz12.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Alignment;
import org.example.it355dz12.repository.AlignmentRepository;
import org.example.it355dz12.service.AlignmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlignmentServiceImpl implements AlignmentService {

    private final AlignmentRepository alignmentRepository;

    @Override
    public List<Alignment> findAll() {
        return alignmentRepository.findAll();
    }

    @Override
    public Optional<Alignment> findById(Integer id) {
        return alignmentRepository.findById(id);
    }

    @Override
    public Alignment save(Alignment alignment) {
        return alignmentRepository.save(alignment);
    }

    @Override
    public Alignment update(Alignment alignment) {
        return alignmentRepository.save(alignment);
    }

    @Override
    public void deleteById(Integer id) {
        alignmentRepository.deleteById(id);
    }
}
