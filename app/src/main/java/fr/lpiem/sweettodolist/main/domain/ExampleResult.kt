package fr.lpiem.sweettodolist.main.domain

import fr.lpiem.sweettodolist.base.domain.ResultType

sealed class MainResult: ResultType {

    object DownloadingWebpage: MainResult()
    data class DownloadedWebpage(val html: String?, val error: Throwable?): MainResult()

}