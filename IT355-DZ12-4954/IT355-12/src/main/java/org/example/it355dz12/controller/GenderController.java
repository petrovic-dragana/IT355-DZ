package org.example.it355dz12.controller;

import lombok.RequiredArgsConstructor;
import org.example.it355dz12.model.Gender;
import org.example.it355dz12.service.GenderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/gender")
@RequiredArgsConstructor
public class GenderController {

    private final GenderService genderService;

    @GetMapping
    public ResponseEntity<List<Gender>> getAll(){
        return ResponseEntity.ok(genderService.findAll());
    }

    @GetMapping("/{genderId}")
    public ResponseEntity<Gender> getById(@PathVariable Integer genderId){
        return ResponseEntity.ok(genderService.findById(genderId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GenderNotFound")));
    }

    @PostMapping
    public ResponseEntity<Gender> save(@RequestBody Gender gender){
        return ResponseEntity.ok(genderService.save(gender));
    }

    @PutMapping
    public ResponseEntity<Gender> update(@RequestBody Gender gender){
        return ResponseEntity.ok(genderService.update(gender));
    }

    @DeleteMapping("/{genderId}")
    public ResponseEntity<Gender> deleteById(@PathVariable Integer genderId){
        genderService.deleteById(genderId);
        return ResponseEntity.ok().build();
    }

}
