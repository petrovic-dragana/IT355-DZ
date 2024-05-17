package com.domaci.osmi.service;

import com.domaci.osmi.model.Medal;

import java.util.List;
import java.util.Optional;

public interface MedalService {
    List<Medal> findAll();

    Optional<Medal> findById(Integer medalId);
    Medal save (Medal medal);
    Medal update (Medal medal);
    void deleteById (Integer medalId);
    List<Medal> findByMedalName (String medalName);
}
