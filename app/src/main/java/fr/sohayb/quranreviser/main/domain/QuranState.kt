package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.app.api.response.QuranApiResponse
import fr.sohayb.quranreviser.base.domain.StateType
import fr.sohayb.quranreviser.base.util.BooleanOneTimeEvent
import fr.sohayb.quranreviser.main.data.Ayah
import fr.sohayb.quranreviser.main.data.Sura
import fr.sohayb.quranreviser.main.data.Tafseer
import fr.sohayb.quranreviser.main.data.VerseTafseer

data class QuranState(
    //For AyahTafseerActivity
    val ayahTafseer: VerseTafseer? = null,
    //From SharedPreference
    val currentTafseer: Tafseer? = null,
    //For AyahTafseerActivity
    val currentAyah: Ayah? = null,
    val currentSura: Sura? = null,
    val currentTestAyah: Ayah? = null,
    val goToMainActivity : BooleanOneTimeEvent = BooleanOneTimeEvent(false),
    val listOfSuras : QuranApiResponse? = null

) : StateType