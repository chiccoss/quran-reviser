package fr.sohayb.quranreviser.app.injection

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import fr.sohayb.quranreviser.analytics.domain.AnalyticsProcessor
import fr.sohayb.quranreviser.app.domain.AppController
import fr.sohayb.quranreviser.app.domain.AppProcessor
import fr.sohayb.quranreviser.app.domain.AppReducer
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.app.presentation.AppViewModel
import fr.sohayb.quranreviser.main.domain.QuranProcessor
import org.koin.dsl.module

val AppModule = module {

    single { AppController(get(), get(), get()) }

    single { AppProcessor(get()) }

    single { AppState() }

    factory { (owner: ViewModelStoreOwner) ->
        ViewModelProvider(owner, AppViewModel.Factory(get()))
            .get(AppViewModel::class.java)
    }

    // region Processors

    single {
        listOf(
            get<QuranProcessor>(),
            get<AnalyticsProcessor>()
        )
    }

    // endregion Processors

    // region Reducers

    single {
        AppReducer(
            quranReducer = get(),
            initialState = get()
        )
    }

    // endregion Reducers
}