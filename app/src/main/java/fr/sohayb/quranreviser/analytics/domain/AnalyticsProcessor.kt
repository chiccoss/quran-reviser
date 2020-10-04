package fr.sohayb.quranreviser.analytics.domain

import fr.sohayb.quranreviser.analytics.data.AnalyticsEvent
import fr.sohayb.quranreviser.base.domain.ActionType
import fr.sohayb.quranreviser.base.domain.ProcessorResultCallback
import fr.sohayb.quranreviser.base.domain.ProcessorType

import timber.log.Timber

class AnalyticsProcessor: ProcessorType {

    override suspend fun process(action: ActionType, next: ProcessorResultCallback) {
        when(action) {
            //is MainAction.DownloadWebpage -> trackEvent(AnalyticsEvent.DownloadedWebpage(action.url.toString()))
        }
    }

    private fun trackEvent(event: AnalyticsEvent) {
        Timber.d("Tracking event: $event")
    }
}