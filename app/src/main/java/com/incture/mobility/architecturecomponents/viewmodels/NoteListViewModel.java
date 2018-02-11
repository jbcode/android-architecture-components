package com.incture.mobility.architecturecomponents.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.incture.mobility.architecturecomponents.room.Notes;
import com.incture.mobility.architecturecomponents.room.NotesRepository;

import java.util.List;

/**
 * Created by satiswardash on 10/02/18.
 */

public class NoteListViewModel extends ViewModel {

    private NotesRepository mNotesRepository;

    public NoteListViewModel(NotesRepository mNotesRepository) {
        this.mNotesRepository = mNotesRepository;
    }

    public LiveData<List<Notes>> getAllNotes(){
        return mNotesRepository.getListOfNotes();
    }
}
