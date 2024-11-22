package com.example.TP2.repository;

import com.example.TP2.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    // Récupérer les notes par catégorie
    List<Note> findByCategorieId(Long categorieId);

    // Récupérer les notes par auteur
    List<Note> findByAuteurId(Long auteurId);

    // Supprimer toutes les notes d'une catégorie
    void deleteByCategorieId(Long categorieId);

    // Supprimer toutes les notes d'un auteur
    void deleteByAuteurId(Long auteurId);
}
