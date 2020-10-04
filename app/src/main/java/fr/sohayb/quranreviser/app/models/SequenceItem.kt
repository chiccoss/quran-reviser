package fr.sohayb.quranreviser.app.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "sequence")
data class SequenceItem(
    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0,
    val name: String,
    val quantite: Int
) : Parcelable