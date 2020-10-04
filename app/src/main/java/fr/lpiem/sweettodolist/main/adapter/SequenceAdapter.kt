package fr.lpiem.sweettodolist.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.lpiem.sweettodolist.R
import fr.lpiem.sweettodolist.app.models.Sequence
import kotlinx.android.synthetic.main.item_sequence.view.*


class SequenceAdapter(val onClickResultEvent: (Sequence) -> Unit,val onClickItemResultEvent: (Sequence) -> Unit) :
    ListAdapter<Sequence, SequenceAdapter.SequenceViewHolder>(
        DiffItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SequenceViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sequence, parent, false)
        return SequenceViewHolder(view)
    }

    override fun onBindViewHolder(holder: SequenceViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SequenceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sequence: Sequence) {
            itemView.itemSequenceNameTv.text = "Courses"
            itemView.itemSequenceGoToList.setOnClickListener {
                    onClickItemResultEvent.invoke(sequence)
            }

            itemView.setOnClickListener {
                onClickResultEvent.invoke(sequence)
            }
        }
    }

    class DiffItemCallback : DiffUtil.ItemCallback<Sequence>() {
        override fun areContentsTheSame(
            oldItem: Sequence,
            newItem: Sequence
        ): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: Sequence,
            newItem: Sequence
        ): Boolean {
            return oldItem.uid == newItem.uid
        }
    }
}