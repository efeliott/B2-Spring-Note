package com.example.TP2.service;

import com.example.TP2.entity.Note;
import com.example.TP2.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    // Récupérer toutes les notes
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    // Créer une nouvelle note
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    // Récupérer une note par ID
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note introuvable"));
    }

    // Mettre à jour une note
    public Note updateNote(Long id, Note updatedNote) {
        return noteRepository.findById(id).map(note -> {
            note.setTitre(updatedNote.getTitre());
            note.setContenu(updatedNote.getContenu());
            note.setAuteur(updatedNote.getAuteur());
            note.setCategorie(updatedNote.getCategorie());
            return noteRepository.save(note);
        }).orElseThrow(() -> new RuntimeException("Note introuvable"));
    }

    // Supprimer une note par ID
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }

    // Récupérer les notes par catégorie
    public List<Note> getNotesByCategorie(Long categorieId) {
        return noteRepository.findByCategorieId(categorieId);
    }

    // Récupérer les notes par auteur
    public List<Note> getNotesByAuteur(Long auteurId) {
        return noteRepository.findByAuteurId(auteurId);
    }

    // Supprimer toutes les notes d'une catégorie
    public void deleteNotesByCategorie(Long categorieId) {
        noteRepository.deleteByCategorieId(categorieId);
    }

    // Supprimer toutes les notes d'un auteur
    public void deleteNotesByAuteur(Long auteurId) {
        noteRepository.deleteByAuteurId(auteurId);
    }
}