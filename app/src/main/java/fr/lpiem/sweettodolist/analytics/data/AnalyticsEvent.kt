package fr.lpiem.sweettodolist.analytics.data

sealed class AnalyticsEvent {

    data class DownloadedWebpage(val urlString: String): AnalyticsEvent()

}