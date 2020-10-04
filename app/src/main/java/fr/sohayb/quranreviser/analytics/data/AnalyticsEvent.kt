package fr.sohayb.quranreviser.analytics.data

sealed class AnalyticsEvent {

    data class DownloadedWebpage(val urlString: String): AnalyticsEvent()

}