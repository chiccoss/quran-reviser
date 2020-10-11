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
import kotlinx.android.synthetic.main.item_tafseer_fragment_sura.view.*


class TafseerAdapter(val onClickResultEvent: (Sura) -> Unit,val onClickItemResultEvent: (Sura) -> Unit) :
    ListAdapter<Sura, TafseerAdapter.SuraViewHolder>(
        DiffItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_tafseer_fragment_sura, parent, false)
        return SuraViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuraViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SuraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sura: Sura) {
            //itemView.itemSuraNameTv.text = "Courses"
           /* itemView.itemSuraGoToList.setOnClickListener {
                    onClickItemResultEvent.invoke(sequence)
            }*/
            itemView.itemTafseerSuraNameTv.text = sura.name

            itemView.itemTafseerSuraAyatNumberTv.text = sura.numberOfVerses.toString()

            itemView.setOnClickListener {
                onClickResultEvent.invoke(sura)
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