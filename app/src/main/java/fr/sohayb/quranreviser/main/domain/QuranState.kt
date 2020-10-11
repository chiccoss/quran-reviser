package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.app.api.response.QuranApiResponse
import fr.sohayb.quranreviser.base.domain.StateType
import fr.sohayb.quranreviser.base.util.BooleanOneTimeEvent
import fr.sohayb.quranreviser.main.data.VerseTafseer

data class QuranState(
    val currentAyah: VerseTafseer? = null,
      val goToMainActivity : BooleanOneTimeEvent = BooleanOneTimeEvent(false),
    val listOfSuras : QuranApiResponse? = null

) : StateType