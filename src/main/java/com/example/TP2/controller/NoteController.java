package com.example.TP2.controller;

import com.example.TP2.entity.Note;
import com.example.TP2.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    // GET: Récupérer toutes les notes
    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    // POST: Créer une nouvelle note
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    // GET: Récupérer une note par son ID
    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    // PUT: Mettre à jour une note
    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note updatedNote) {
        return noteService.updateNote(id, updatedNote);
    }

    // DELETE: Supprimer une note
    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNoteById(id);
    }

    // GET: Récupérer les notes par catégorie
    @GetMapping("/categorie/{categorieId}")
    public List<Note> getNotesByCategorie(@PathVariable Long categorieId) {
        return noteService.getNotesByCategorie(categorieId);
    }

    // GET: Récupérer les notes par auteur
    @GetMapping("/auteur/{auteurId}")
    public List<Note> getNotesByAuteur(@PathVariable Long auteurId) {
        return noteService.getNotesByAuteur(auteurId);
    }

    // DELETE: Supprimer toutes les notes d'une catégorie
    @DeleteMapping("/categorie/{categorieId}")
    public void deleteNotesByCategorie(@PathVariable Long categorieId) {
        noteService.deleteNotesByCategorie(categorieId);
    }

    // DELETE: Supprimer toutes les notes d'un auteur
    @DeleteMapping("/auteur/{auteurId}")
    public void deleteNotesByAuteur(@PathVariable Long auteurId) {
        noteService.deleteNotesByAuteur(auteurId);
    }
}