package infrrd.ai.nevernotemvp.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import infrrd.ai.nevernotemvp.R
import kotlinx.android.synthetic.main.recycler_cell_layout.view.*

class NotesAdapter(private var notesDataSet: List<String>): RecyclerView.Adapter<NotesAdapter.MyViewHolder>() {

    class MyViewHolder(val note: RelativeLayout) : RecyclerView.ViewHolder(note)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesAdapter.MyViewHolder {
        val noteView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_cell_layout, parent, false) as RelativeLayout
        return MyViewHolder(noteView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.note.body.text = notesDataSet[position]
    }


    override fun getItemCount() = notesDataSet.size

}