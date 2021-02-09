package fr.sohayb.quranreviser.app.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val uid: Int = 0,
    val firstName: String,
    val lastName: String,
    val role : String,
    val email: String
) : Parcelable