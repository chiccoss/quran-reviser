package fr.lpiem.sweettodolist.main.mocks

import fr.lpiem.sweettodolist.main.data.MainRepository
import java.net.URL

class MockMainRepositorySucceeds: MainRepository {

    override fun downloadWebPageAtURL(url: URL): Result<String> {
        return Result.success(url.toString())
    }
}

class MockMainRepositoryFails: MainRepository {
    override fun downloadWebPageAtURL(url: URL): Result<String> {
        return Result.failure(RuntimeException("TestRepositoryImplFails"))
    }
}