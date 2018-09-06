package infrrd.ai.nevernotemvp.main

import android.support.v4.app.FragmentManager
import infrrd.ai.nevernotemvp.Adapter.NotesAdapter

interface MainView {
    val supportFragment: FragmentManager
    var adapter: NotesAdapter
    fun setDataSet(items: List<String>)
}