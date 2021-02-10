package fr.sohayb.quranreviser.app.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable


@Serializable
@Parcelize
data class QuranResponse(
    val code: Int,
    val data: Data,
    val status: String
) : Parcelable