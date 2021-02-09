package fr.sohayb.quranreviser.app.models

import android.os.Parcelable

import kotlinx.android.parcel.Parcelize

@Parcelize
data class SequenceItem(
    val uid: Int = 0,
    val name: String,
    val quantite: Int
) : Parcelable