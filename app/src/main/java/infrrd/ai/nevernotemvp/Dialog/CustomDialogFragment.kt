package infrrd.ai.nevernotemvp.Dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatDialog
import android.support.v7.app.AppCompatDialogFragment
import android.view.LayoutInflater
import android.view.View
import infrrd.ai.nevernotemvp.R

class CustomDialogFragment: AppCompatDialogFragment(), DialogView {

    val dialogInteractor = DialogInteractor()
    val dialogPresenter = DialogPresenter(this, dialogInteractor)
    lateinit var dialogLayout: View

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        dialogLayout = LayoutInflater.from(activity).inflate(R.layout.dialog_box, null)
        builder.setView(dialogLayout)
        builder.setPositiveButton("Ok",dialogPresenter)
        return builder.create()
    }
}