package org.example.it355dz07.controller;


import org.example.it355dz07.model.Restoran;
import org.example.it355dz07.repository.RestoranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class RestoranController {

    @Autowired
    private RestoranRepository restoranRepository;

    @GetMapping("/restorani")
    public String sviRestorani(Model model) {
        List<Restoran> restorani = restoranRepository.findAll();
        model.addAttribute("restorani", restorani);
        return "restorani";
    }

    @GetMapping("/restorani/create")
    public String create(Model model){
        model.addAttribute("restoran", new Restoran());
        return "editrestoran";
    }

    @PostMapping("/restorani/save")
    public String save(@Validated Restoran restoran, BindingResult result) {
        if (result.hasErrors()) {
            return "editrestoran";
        }
        restoranRepository.save(restoran);
        return "redirect:/restorani";
    }

    @GetMapping("/restorani/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Optional<Restoran> restoran = restoranRepository.findById(id);
        if (restoran.isPresent()) {
            model.addAttribute("restoran", restoran.get());
            return "editrestoran";
        } else {
            return "redirect:/restorani";
        }
    }

    @GetMapping("/restorani/delete/{id}")
    public String delete(@PathVariable Long id) {
        restoranRepository.deleteById(id);
        return "redirect:/restorani";
    }
    @GetMapping("/restorani/top5")
    public String top5Restorani(Model model) {
        List<Restoran> top5Restorani = restoranRepository.findTop5ByOrderByOcenaDesc();
        model.addAttribute("top5Restorani", top5Restorani);
        return "top5restorani";
    }
}
