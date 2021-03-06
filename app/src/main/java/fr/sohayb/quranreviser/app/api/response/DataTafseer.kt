package fr.sohayb.quranreviser.app.api.response

import kotlinx.serialization.Serializable


@Serializable
data class DataTafseer(
    val englishName: String,
    val englishNameTranslation: String,
    val name: String,
    val number: Int,
    val numberOfAyahs: Int,
    val revelationType: String
)