package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.ActionType
import java.net.URL

sealed class QuranAction: ActionType {

    object InitApplication : QuranAction()
    data class GetAyahTafseer(var tafseerId: Int,var suraNumber: Int,var ayahId: Int): QuranAction()
    object GetNumberOfAyat : QuranAction()
    data class GotAyah(val ayah: String): QuranAction()


}