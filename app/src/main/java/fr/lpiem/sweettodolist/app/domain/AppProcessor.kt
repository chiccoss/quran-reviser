package fr.lpiem.sweettodolist.app.domain

import fr.lpiem.sweettodolist.base.domain.ActionType
import fr.lpiem.sweettodolist.base.domain.ProcessorResultCallback
import fr.lpiem.sweettodolist.base.domain.ProcessorType

class AppProcessor(private val processors: List<ProcessorType>): ProcessorType {

    override suspend fun process(action: ActionType, next: ProcessorResultCallback) {
        for (processor in processors) {
            processor.process(action, next)
        }
    }
}