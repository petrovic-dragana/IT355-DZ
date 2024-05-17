package com.domaci.osmi.controller;

import com.domaci.osmi.model.Medal;
import com.domaci.osmi.service.MedalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medal")
public class MedalController {

    @Autowired
    private MedalService medalService;

    @GetMapping
    public List<Medal> getAllMedals() {
        return medalService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Medal> getMedalById(@PathVariable Integer id) {
        return medalService.findById(id);
    }

    @GetMapping("/name/{medalName}")
    public List<Medal> getMedalsByMedalName(@PathVariable String medalName) {
        return medalService.findByMedalName(medalName);
    }

    @PostMapping
    public Medal createMedal(@RequestBody Medal medal) {
        return medalService.save(medal);
    }

    @PutMapping("/{id}")
    public Medal updateMedal(@PathVariable Integer id, @RequestBody Medal medal) {
        medal.setId(id);
        return medalService.update(medal);
    }

    @DeleteMapping("/{id}")
    public void deleteMedal(@PathVariable Integer id) {
        medalService.deleteById(id);
    }
}
