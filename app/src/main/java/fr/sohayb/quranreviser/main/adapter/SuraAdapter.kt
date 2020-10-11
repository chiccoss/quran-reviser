package fr.sohayb.quranreviser.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.main.data.Sura
import kotlinx.android.synthetic.main.item_sura.view.*


class SuraAdapter(
    val onClickResultEvent: (Sura) -> Unit,
    val onLongClickItemResultEvent: (Sura) -> Unit
) :
    ListAdapter<Sura, SuraAdapter.SuraViewHolder>(
        DiffItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sura, parent, false)
        return SuraViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuraViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SuraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sura: Sura) {
            itemView.itemSuraNameTv.text = sura.name

            itemView.itemSuraAyatNumberTv.text = sura.numberOfVerses.toString()


            itemView.setOnClickListener {
                onClickResultEvent.invoke(sura)
            }
            itemView.setOnLongClickListener {
                onLongClickItemResultEvent.invoke(sura)
                true
            }
        }
    }

    class DiffItemCallback : DiffUtil.ItemCallback<Sura>() {
        override fun areContentsTheSame(
            oldItem: Sura,
            newItem: Sura
        ): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: Sura,
            newItem: Sura
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}