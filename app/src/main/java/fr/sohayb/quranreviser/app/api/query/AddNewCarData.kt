package fr.sohayb.quranreviser.app.api.query

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AddNewCarData(
    @SerialName("vehicle_template_id") val vehicleId: Int,
    @SerialName("vehicle_model_id") val modelId: Int?,
    @SerialName("plate") val registration: String
)