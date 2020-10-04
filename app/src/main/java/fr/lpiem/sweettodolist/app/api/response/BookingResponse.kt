package fr.lpiem.sweettodolist.app.api.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class BookingResponse (
    val id: Int,
    val vehicle: Int,
    val parking: Int,
    @SerialName("date_start") val dateStart: String,
    @SerialName("date_end") val dateEnd: String,
    @SerialName("value_initial_ht") val amountDf: Double,
    @SerialName("value_initial_ttc") val amountAti: Double,
    @SerialName("payment_external") val externalPayment: Boolean
){
  /*  fun toLocalBooking(): Booking {
        return Booking(
            id,
            vehicle,
            parking,
            dateStart.getDateFromWebservice(),
            dateEnd.getDateFromWebservice(),
            amountDf,
            amountAti,
            externalPayment
        )
    }*/
}