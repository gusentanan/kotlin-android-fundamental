package com.example.learn_activity.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.learn_activity.db.Note
import com.example.learn_activity.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun delete(note: Note){
        mNoteRepository.delete(note)
    }

    fun update(note: Note){
        mNoteRepository.update(note)
    }
}