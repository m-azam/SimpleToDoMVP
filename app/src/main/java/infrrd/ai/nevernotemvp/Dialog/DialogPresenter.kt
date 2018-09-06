package infrrd.ai.nevernotemvp.Dialog

import android.content.DialogInterface
import android.widget.EditText
import infrrd.ai.nevernotemvp.R
import kotlinx.android.synthetic.main.dialog_box.view.*

class DialogPresenter(var dialogFragment: CustomDialogFragment, val dialogInteractor: DialogInteractor)
    : DialogInterface.OnClickListener {
    override fun onClick(dialog: DialogInterface?, id: Int) {
        dialogInteractor.getNoteContent(dialogFragment.dialogLayout.findViewById<EditText>(R.id.note_text)
                .text.toString())
    }

}