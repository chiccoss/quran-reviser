package fr.lpiem.sweettodolist.app

import fr.lpiem.sweettodolist.base.domain.ProcessorResultCallback
import fr.lpiem.sweettodolist.base.domain.ResultType

class MockProcessorResultCallback: ProcessorResultCallback {

    val results = mutableListOf<ResultType>()

    override fun invoke(p1: ResultType) {
        results.add(p1)
    }
}