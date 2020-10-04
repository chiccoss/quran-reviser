package fr.sohayb.quranreviser.main.injection

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import fr.sohayb.quranreviser.main.data.MainRepository
import fr.sohayb.quranreviser.main.data.TestRepositoryImpl
import fr.sohayb.quranreviser.main.domain.MainProcessor
import fr.sohayb.quranreviser.main.domain.MainReducer
import fr.sohayb.quranreviser.main.presentation.MainViewModel
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