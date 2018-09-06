package infrrd.ai.nevernotemvp.main

import infrrd.ai.nevernotemvp.Dialog.DialogInteractor
import java.util.ArrayList

class NoteItemsInteractor: DialogInteractor.OnNoteSubmit {

    var noteContent: String? = null
    var notesDataSet: MutableList<String> = ArrayList()

    override fun onSubmit(noteContent: String) {
        this.noteContent = noteContent
        notesDataSet.add(noteContent)
    }

    fun setNoteItems(callback: (List<String>) -> Unit) {
        callback(initNoteItems())
    }

    private fun initNoteItems(): List<String> {
        return notesDataSet
    }
}