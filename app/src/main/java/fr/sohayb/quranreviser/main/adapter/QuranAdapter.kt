package fr.sohayb.quranreviser.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.models.Surah
import kotlinx.android.synthetic.main.item_tafseer_fragment_sura.view.*


class QuranAdapter(val onClickResultEvent: (Surah) -> Unit, val onClickItemResultEvent: (Surah) -> Unit) :
    ListAdapter<Surah, QuranAdapter.SuraViewHolder>(
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
        fun bind(sura: Surah) {
            //itemView.itemSuraNameTv.text = "Courses"
           /* itemView.itemSuraGoToList.setOnClickListener {
                    onClickItemResultEvent.invoke(sequence)
            }*/
            itemView.itemTafseerSuraNameTv.text = sura.name

            itemView.itemTafseerSuraAyatNumberTv.text = sura.ayahs.size.toString()

            itemView.setOnClickListener {
                onClickResultEvent.invoke(sura)
            }
        }
    }

    class DiffItemCallback : DiffUtil.ItemCallback<Surah>() {
        override fun areContentsTheSame(
            oldItem: Surah,
            newItem: Surah
        ): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: Surah,
            newItem: Surah
        ): Boolean {
            return oldItem.number == newItem.number
        }
    }
}