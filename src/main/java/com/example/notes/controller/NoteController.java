package com.example.notes.controller;

import com.example.notes.model.Note;
import com.example.notes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/notes")
@CrossOrigin("http://localhost:3000/")
public class NoteController {

    private final NoteService noteService;

    @GetMapping
    List<Note> getNotes(){
        return noteService.getNotes();
    }

    @PostMapping
    Note createNote(@RequestBody Note note){
        return noteService.createNote(note);
    }

    @DeleteMapping("{id}")
    void deleteNoteById(@PathVariable Long id){
        noteService.deleteNoteById(id);
    }
}
