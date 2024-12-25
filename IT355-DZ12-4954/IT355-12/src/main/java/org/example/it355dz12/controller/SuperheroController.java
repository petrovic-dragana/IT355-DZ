package org.example.it355dz12.controller;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Superhero;
import org.example.it355dz12.service.SuperheroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/superhero")
@RequiredArgsConstructor
public class SuperheroController {

    private final SuperheroService superheroService;

    @GetMapping
    public ResponseEntity<List<Superhero>> getAll(){
        return ResponseEntity.ok(superheroService.findAll());
    }

    @GetMapping("/{superheroId}")
    public ResponseEntity<Superhero> getById(@PathVariable Integer superheroId){
        return ResponseEntity.ok(superheroService.findById(superheroId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SuperheroNotFound")));
    }

    @PostMapping
    public ResponseEntity<Superhero> save(@RequestBody Superhero superhero){
        return ResponseEntity.ok(superheroService.save(superhero));
    }

    @PutMapping
    public ResponseEntity<Superhero> update(@RequestBody Superhero superhero){
        return ResponseEntity.ok(superheroService.update(superhero));
    }

    @DeleteMapping("/{superheroId}")
    public ResponseEntity<Superhero> deleteById(@PathVariable Integer superheroId){
        superheroService.deleteById(superheroId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search/{heightCm}")
    public ResponseEntity<List<Superhero>> getByByHeightCmGreaterThan(@PathVariable("heightCm") int heightCm){
        return ResponseEntity.ok(superheroService.findByHeightCmGreaterThan(heightCm));
    }
}
