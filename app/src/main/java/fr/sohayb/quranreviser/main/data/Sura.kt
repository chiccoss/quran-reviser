package fr.sohayb.quranreviser.main.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.Serializable


@Serializable
@Parcelize
data class Sura (
    val id : Int,
    val name: String,
    val numberOfVerses : Int
) : Parcelable