package fr.sohayb.quranreviser.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.main.data.Ayah


class AyahAdapter(
    val onClickResultEvent: (Ayah) -> Unit,
    val onLongClickItemResultEvent: (Ayah) -> Unit
) :
    ListAdapter<Ayah, AyahAdapter.AyahViewHolder>(
        DiffItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AyahViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_ayah, parent, false)
        return AyahViewHolder(view)
    }

    override fun onBindViewHolder(holder: AyahViewHolder, position: Int) {
        //holder.bind(getItem(position))
    }

    inner class AyahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(ayah: Ayah) {
            //itemView.itemAyahTextTv.text = sura.name

            /*itemView.setOnClickListener {
                onClickResultEvent.invoke(sura)
            }
            itemView.setOnLongClickListener {
                onLongClickItemResultEvent.invoke(sura)
                true
            }*/
        }
    }

        class DiffItemCallback : DiffUtil.ItemCallback<Ayah>() {
        override fun areContentsTheSame(
            oldItem: Ayah,
            newItem: Ayah
        ): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: Ayah,
            newItem: Ayah
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}