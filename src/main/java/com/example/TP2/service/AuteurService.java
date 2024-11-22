package com.example.TP2.service;

import com.example.TP2.entity.Auteur;
import com.example.TP2.repository.AuteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {

    private final AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public Auteur createAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }

    public Auteur updateAuteur(Long id, Auteur updatedAuteur) {
        return auteurRepository.findById(id).map(auteur -> {
            auteur.setNom(updatedAuteur.getNom());
            return auteurRepository.save(auteur);
        }).orElseThrow(() -> new RuntimeException("Auteur introuvable"));
    }

    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    public Auteur getAuteurById(Long id) {
        return auteurRepository.findById(id).orElseThrow(() -> new RuntimeException("Auteur introuvable"));
    }
}