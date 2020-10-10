package fr.sohayb.quranreviser.main.injection

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import fr.sohayb.quranreviser.main.data.QuranRepository
import fr.sohayb.quranreviser.main.domain.QuranProcessor
import fr.sohayb.quranreviser.main.domain.QuranReducer
import fr.sohayb.quranreviser.main.presentation.MainViewModel
import org.koin.dsl.module

val QuranModule = module {

    single { QuranRepository(get(),get()) }

    single { QuranProcessor(get(),get()) }

    single { QuranReducer() }

    factory { (owner: ViewModelStoreOwner) ->
        ViewModelProvider(owner, MainViewModel.Factory(get()))
            .get(MainViewModel::class.java)
    }

}