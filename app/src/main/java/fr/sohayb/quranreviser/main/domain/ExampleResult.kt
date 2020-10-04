package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.ResultType

sealed class MainResult: ResultType {

    object DownloadingWebpage: MainResult()
    data class DownloadedWebpage(val html: String?, val error: Throwable?): MainResult()

}