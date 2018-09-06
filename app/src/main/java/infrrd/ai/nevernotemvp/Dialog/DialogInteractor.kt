package infrrd.ai.nevernotemvp.Dialog

class DialogInteractor() {

    private var onNoteSubmit: OnNoteSubmit? = null

    interface OnNoteSubmit {
        fun onSubmit(noteContent: String)
    }

    fun connectToDialog(onNoteSubmit: OnNoteSubmit) {
        this.onNoteSubmit = onNoteSubmit
    }

    fun getNoteContent(noteContent: String)
    {
        onNoteSubmit?.onSubmit(noteContent)
    }
}