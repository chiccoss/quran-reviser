package fr.sohayb.quranreviser.app

import fr.sohayb.quranreviser.base.domain.ProcessorResultCallback
import fr.sohayb.quranreviser.base.domain.ResultType

class MockProcessorResultCallback: ProcessorResultCallback {

    val results = mutableListOf<ResultType>()

    override fun invoke(p1: ResultType) {
        results.add(p1)
    }
}