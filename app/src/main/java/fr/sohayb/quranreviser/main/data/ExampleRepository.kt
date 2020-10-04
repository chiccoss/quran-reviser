package fr.sohayb.quranreviser.main.data

import androidx.annotation.WorkerThread
import timber.log.Timber
import java.net.URL

interface MainRepository {

    @WorkerThread
    fun downloadWebPageAtURL(url: URL): Result<String>
}

class TestRepositoryImpl: MainRepository {

    @WorkerThread
    override fun downloadWebPageAtURL(url: URL): Result<String> {
        return try {

            val connection = url.openConnection().apply { connect() }
            val content = connection.getInputStream().bufferedReader().use {
                it.readText()
            }

            Timber.d("TEST -> reporting content on thread: ${Thread.currentThread()}")
            Result.success(content)

        } catch(t: Throwable) {
            Timber.d("TEST -> reporting error on thread: ${Thread.currentThread()}")
            Timber.e(t, "TEST ->")
            Result.failure(t)
        }
    }
}