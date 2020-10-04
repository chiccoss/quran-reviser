package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.ActionType
import java.net.URL

sealed class QuranAction: ActionType {

    data class GetAyahTafseer(var tafseerId: Int,var suraNumber: Int,var ayahId: Int): QuranAction()

    data class GotAyah(val ayah: String): QuranAction()


}