package com.example.notes.service.impl;

import com.example.notes.model.Note;
import com.example.notes.repository.NoteRepository;
import com.example.notes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }
}
