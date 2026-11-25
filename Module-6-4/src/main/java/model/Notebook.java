package model;
import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public void removeNote(Note note) {
        notes.remove(note);
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
}
