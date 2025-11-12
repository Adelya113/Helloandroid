package com.example.helloandroid.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import com.example.helloandroid.data.*

class NoteViewModel(private val repo: NoteRepository): ViewModel() {
    val notes = repo.all().stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    fun add(title: String, content: String) = viewModelScope.launch {
        repo.add(title, content)
    }

    fun remove(note: Note) = viewModelScope.launch {
        repo.delete(note)
    }
}
