package com.domaci.osmi.service.impl;

import com.domaci.osmi.model.Medal;
import com.domaci.osmi.repository.MedalRepository;
import com.domaci.osmi.service.MedalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MedalServiceImpl implements MedalService {

    private final MedalRepository medalRepository;


    @Override
    public List<Medal> findAll() {
        return medalRepository.findAll();
    }

    @Override
    public Optional<Medal> findById(Integer medalId) {
        return medalRepository.findById(medalId);

    }

    @Override
    public Medal save(Medal medal) {
        return medalRepository.save(medal);
    }

    @Override
    public Medal update(Medal medal) {
        return medalRepository.save(medal);
    }

    @Override
    public void deleteById(Integer medalId) {
        medalRepository.deleteById(medalId);
    }

    @Override
    public List<Medal> findByMedalName(String medalName) {
        return medalRepository.findByMedalName(medalName);
    }
}
