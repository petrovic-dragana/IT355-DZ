package org.example.it355dz07.controller;


import org.example.it355dz07.model.Jelo;
import org.example.it355dz07.model.Restoran;
import org.example.it355dz07.repository.JeloRepository;
import org.example.it355dz07.repository.RestoranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class JeloController {

    @Autowired
    private JeloRepository jeloRepository;
    @Autowired
    private RestoranRepository restoranRepository;

    @GetMapping("/jela")
    public String svaJela(Model model) {
        List<Jelo> jela = jeloRepository.findAll();
        model.addAttribute("jela", jela);
        return "jela";
    }

    @GetMapping("/jela/create")
    public String create(Model model){
        List<Restoran> restorani = restoranRepository.findAll();
        model.addAttribute("restorani", restorani);
        model.addAttribute("jelo", new Jelo());
        return "editjelo";
    }

    @PostMapping("/jela/save")
    public String save(@Validated Jelo jelo, BindingResult result) {
        if (result.hasErrors()) {
            return "editjelo";
        }
        jeloRepository.save(jelo);
        return "redirect:/jela";
    }

    @GetMapping("/jela/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Optional<Jelo> jelo = jeloRepository.findById(id);

        List<Restoran> restorani = restoranRepository.findAll();
        model.addAttribute("restorani", restorani);

        if (jelo.isPresent()) {
            model.addAttribute("jelo", jelo.get());
            return "editjelo";
        } else {
            return "redirect:/jela";
        }
    }

    @GetMapping("/jela/delete/{id}")
    public String delete(@PathVariable Long id) {
        jeloRepository.deleteById(id);
        return "redirect:/jela";
    }

    @GetMapping("/jela/search")
    public String serchJelo(@RequestParam String naziv, Model model){
        Optional<List<Jelo>> jela = jeloRepository.findAllByNaziv(naziv);

        if(jela.isPresent()){
            model.addAttribute("jela", jela.get());
            return "jela";
        } else {
            return "redirect:/jela";
        }
    }

}
