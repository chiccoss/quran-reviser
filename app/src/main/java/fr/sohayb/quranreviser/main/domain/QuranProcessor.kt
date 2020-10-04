package fr.sohayb.quranreviser.main.domain

import android.content.Context
import fr.sohayb.quranreviser.app.api.Resource
import fr.sohayb.quranreviser.base.domain.ActionType
import fr.sohayb.quranreviser.base.domain.ProcessorResultCallback
import fr.sohayb.quranreviser.base.domain.ProcessorType
import fr.sohayb.quranreviser.main.data.QuranRepository

class QuranProcessor(
    val quranRepository: QuranRepository,
    private val context: Context
) : ProcessorType {
    override suspend fun process(action: ActionType, next: ProcessorResultCallback) {
        (action as? QuranAction)?.let {
            when (it) {
                is QuranAction.GetAyahTafseer -> getAyahTafseer(
                    it.tafseerId,
                    it.suraNumber,
                    it.ayahId,
                    next
                )


            }
        }
    }


    suspend fun getAyahTafseer(
        tafseerId: Int, suraNumber: Int, ayahId: Int,
        next: ProcessorResultCallback
    ) {
        quranRepository.getAyahTafseer(
            tafseerId, suraNumber, ayahId

        ).apply {
            when (this) {
                is Resource.Success -> next(QuranResult.GotAyahTafseer(data))
                is Resource.Error -> next(QuranResult.QuranError(error))
            }
        }
    }

}