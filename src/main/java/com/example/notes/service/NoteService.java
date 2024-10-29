package com.example.notes.service;

import com.example.notes.model.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);
    void deleteNoteById(Long id);
    List<Note> getNotes();
}
