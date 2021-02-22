package fr.sohayb.quranreviser.main.adapter



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.models.Ayah
import kotlinx.android.synthetic.main.item_aya.view.*


class SurahAdapter(val onClickResultEvent: (Ayah) -> Unit, val onClickItemResultEvent: (Ayah) -> Unit) :
    ListAdapter<Ayah, SurahAdapter.SuraViewHolder>(
        DiffItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_aya, parent, false)
        return SuraViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuraViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SuraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(ayah: Ayah) {
            //itemView.itemSuraNameTv.text = "Courses"
            /* itemView.itemSuraGoToList.setOnClickListener {
                     onClickItemResultEvent.invoke(sequence)
             }*/
            itemView.itemTafseerSuraNameTv.text = ayah.text

            itemView.itemTafseerSuraAyatNumberTv.text = ayah.number.toString()

            itemView.setOnClickListener {
                onClickResultEvent.invoke(ayah)
            }
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
            return oldItem.number == newItem.number
        }
    }
}