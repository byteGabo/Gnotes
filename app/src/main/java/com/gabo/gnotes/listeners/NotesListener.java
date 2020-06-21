package com.gabo.gnotes.listeners;

import com.gabo.gnotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
