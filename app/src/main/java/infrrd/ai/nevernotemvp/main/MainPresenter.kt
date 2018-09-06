package infrrd.ai.nevernotemvp.main

import android.support.v4.app.DialogFragment
import android.view.MenuItem
import infrrd.ai.nevernotemvp.Dialog.CustomDialogFragment

class MainPresenter(var mainView: MainView?, val noteItemsInteractor: NoteItemsInteractor) {
    fun onResume() {
        noteItemsInteractor.setNoteItems(::onItemsLoaded)
    }
    fun onItemsLoaded(items: List<String>) {
        mainView?.apply {
            setDataSet(items)
        }
    }
    fun onDestroy() {
        mainView = null
    }

    fun showDialogBox(item: MenuItem) {
        val dialogFragment = CustomDialogFragment()
        dialogFragment.dialogInteractor.connectToDialog(noteItemsInteractor)
        dialogFragment.show(mainView?.supportFragment,"Adding")
    }

}