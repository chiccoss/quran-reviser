package fr.sohayb.quranreviser.app.api.response

import kotlinx.serialization.Serializable


@Serializable
data class QuranApiResponse(
    val code: Int,
    val data: List<Data>,
    val status: String
)