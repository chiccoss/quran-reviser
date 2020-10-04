package fr.sohayb.quranreviser.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.models.SequenceItem


class SequenceItemAdapter(val onClickResultEvent: (SequenceItem) -> Unit) :
    ListAdapter<SequenceItem, SequenceItemAdapter.SequenceItemViewHolder>(
        DiffItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SequenceItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sequence_item, parent, false)
        return SequenceItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: SequenceItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SequenceItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sequence: SequenceItem) {
            //itemView.itemSequenceItemNameTv.text = "Courses"
            //itemView.itemSequenceItemGoToList.setOnClickListener {
            //        onClickItemResultEvent.invoke(sequence)
            //}

            itemView.setOnClickListener {
                onClickResultEvent.invoke(sequence)
            }
        }
    }

    class DiffItemCallback : DiffUtil.ItemCallback<SequenceItem>() {
        override fun areContentsTheSame(
            oldItem: SequenceItem,
            newItem: SequenceItem
        ): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: SequenceItem,
            newItem: SequenceItem
        ): Boolean {
            return oldItem.uid == newItem.uid
        }
    }
}