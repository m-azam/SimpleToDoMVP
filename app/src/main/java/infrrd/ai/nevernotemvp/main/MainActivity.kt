package infrrd.ai.nevernotemvp.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import infrrd.ai.nevernotemvp.R
import infrrd.ai.nevernotemvp.Adapter.NotesAdapter
import infrrd.ai.nevernotemvp.Dialog.CustomDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(), MainView {

    override val supportFragment = supportFragmentManager
    override lateinit var adapter: NotesAdapter
    private val presenter = MainPresenter(this, NoteItemsInteractor())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.itemId) {
            R.id.add_note -> {
                presenter.showDialogBox(item)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun setDataSet(items: List<String>) {
        this.adapter = NotesAdapter(items)
        note_recycler.adapter = this.adapter
        note_recycler.layoutManager = LinearLayoutManager(this)
    }

}