package fr.lpiem.sweettodolist.main.injection

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import fr.lpiem.sweettodolist.main.data.MainRepository
import fr.lpiem.sweettodolist.main.data.TestRepositoryImpl
import fr.lpiem.sweettodolist.main.domain.MainProcessor
import fr.lpiem.sweettodolist.main.domain.MainReducer
import fr.lpiem.sweettodolist.main.presentation.MainViewModel
import org.koin.dsl.module

val MainModule = module {

    single<MainRepository> { TestRepositoryImpl() }

    single { MainProcessor(get()) }

    single { MainReducer() }

    factory { (owner: ViewModelStoreOwner) ->
        ViewModelProvider(owner, MainViewModel.Factory(get()))
            .get(MainViewModel::class.java)
    }

}