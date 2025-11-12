package com.example.helloandroid.data

class NoteRepository(private val dao: NoteDao) {
    fun all() = dao.getAll()
    suspend fun add(title: String, content: String) = dao.insert(Note(title = title, content = content))
    suspend fun update(note: Note) = dao.update(note)
    suspend fun delete(note: Note) = dao.delete(note)
    suspend fun clear() = dao.clear()
}
