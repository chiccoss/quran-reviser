package fr.sohayb.quranreviser.app.api.response


import fr.sohayb.quranreviser.main.data.VerseTafseer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class VerseTafseerResponse(
    @SerialName("tafseer_id") val id: Int,
    @SerialName("tafseer_name") val tafseerName: String,
    @SerialName("ayah_url") val ayahURL: String,
    @SerialName("ayah_number") val ayahNumber: Int,
    @SerialName("text") val ayahText: String
) {
    fun toLocalVerseTafseer(): VerseTafseer {
        return VerseTafseer(
            id,
            tafseerName,
            ayahURL,
            ayahNumber,
            ayahText
        )
    }
}