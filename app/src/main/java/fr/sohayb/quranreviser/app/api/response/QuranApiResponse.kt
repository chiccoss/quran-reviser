package fr.sohayb.quranreviser.app.api.response

import kotlinx.serialization.Serializable


@Serializable
data class QuranApiResponse(
    val code: Int,
    val data: List<DataTafseer>,
    val status: String
)