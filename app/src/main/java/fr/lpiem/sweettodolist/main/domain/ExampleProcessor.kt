package fr.lpiem.sweettodolist.main.domain

import fr.lpiem.sweettodolist.base.domain.ActionType
import fr.lpiem.sweettodolist.base.domain.ProcessorResultCallback
import fr.lpiem.sweettodolist.base.domain.ProcessorType
import fr.lpiem.sweettodolist.main.data.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.supervisorScope
import kotlinx.coroutines.withContext
import timber.log.Timber
import java.net.URL

class MainProcessor(private val exampleRepository: MainRepository): ProcessorType {

    override suspend fun process(action: ActionType, next: ProcessorResultCallback) {
        if(action !is MainAction) return

        when(action) {
            is MainAction.DownloadWebpage -> downloadWebpage(action.url, next)
        }
    }

    private suspend fun downloadWebpage(url: URL, next: ProcessorResultCallback) = supervisorScope {

        Timber.d("TEST -> starting webpage download on thread: ${Thread.currentThread()}")

        // we have created a new scope, still on parent dispatcher
        next(MainResult.DownloadingWebpage)

        withContext(Dispatchers.IO) {
            Timber.d("TEST -> switched context to thread: ${Thread.currentThread()}")
            val result = exampleRepository.downloadWebPageAtURL(url)

            result.onSuccess { html ->
                val modified = applyBusinessRulesToWebpageHtml(html)
                next(MainResult.DownloadedWebpage(modified, null))
            }

            result.onFailure { next(MainResult.DownloadedWebpage(null, it)) }
        }
    }

    fun applyBusinessRulesToWebpageHtml(html: String): String {
        return html.filter { !Regex("\\s").containsMatchIn("$it") }.take(20)
    }
}