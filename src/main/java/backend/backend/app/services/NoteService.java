package backend.backend.app.services;

import backend.backend.app.models.Note;
import backend.backend.app.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(int id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Note saveOrUpdateNote(Note note) {
        return noteRepository.save(note);
    }

    public void deleteNote(int id) {
        noteRepository.deleteById(id);
    }
}
