package com.example.TP2.controller;

import com.example.TP2.entity.Auteur;
import com.example.TP2.service.AuteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auteurs")
public class AuteurController {

    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @PostMapping
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurService.createAuteur(auteur);
    }

    @PutMapping("/{id}")
    public Auteur updateAuteur(@PathVariable Long id, @RequestBody Auteur auteur) {
        return auteurService.updateAuteur(id, auteur);
    }

    @DeleteMapping("/{id}")
    public void deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
    }

    @GetMapping
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @GetMapping("/{id}")
    public Auteur getAuteurById(@PathVariable Long id) {
        return auteurService.getAuteurById(id);
    }
}