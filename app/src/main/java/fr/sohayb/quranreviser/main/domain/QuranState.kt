package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.StateType
import fr.sohayb.quranreviser.main.data.VerseTafseer

data class QuranState(
    val currentAyah: VerseTafseer? = null
) : StateType