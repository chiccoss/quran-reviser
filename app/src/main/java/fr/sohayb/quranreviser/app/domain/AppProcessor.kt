package fr.sohayb.quranreviser.app.domain

import fr.sohayb.quranreviser.base.domain.ActionType
import fr.sohayb.quranreviser.base.domain.ProcessorResultCallback
import fr.sohayb.quranreviser.base.domain.ProcessorType

class AppProcessor(private val processors: List<ProcessorType>): ProcessorType {

    override suspend fun process(action: ActionType, next: ProcessorResultCallback) {
        for (processor in processors) {
            processor.process(action, next)
        }
    }
}