package fr.lpiem.sweettodolist.analytics.domain

import fr.lpiem.sweettodolist.analytics.data.AnalyticsEvent
import fr.lpiem.sweettodolist.base.domain.ActionType
import fr.lpiem.sweettodolist.base.domain.ProcessorResultCallback
import fr.lpiem.sweettodolist.base.domain.ProcessorType
import fr.lpiem.sweettodolist.main.domain.MainAction
import timber.log.Timber

class AnalyticsProcessor: ProcessorType {

    override suspend fun process(action: ActionType, next: ProcessorResultCallback) {
        when(action) {
            is MainAction.DownloadWebpage -> trackEvent(AnalyticsEvent.DownloadedWebpage(action.url.toString()))
        }
    }

    private fun trackEvent(event: AnalyticsEvent) {
        Timber.d("Tracking event: $event")
    }
}