package fr.lpiem.sweettodolist.app.injection

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import fr.lpiem.sweettodolist.analytics.domain.AnalyticsProcessor
import fr.lpiem.sweettodolist.app.domain.AppController
import fr.lpiem.sweettodolist.app.domain.AppProcessor
import fr.lpiem.sweettodolist.app.domain.AppReducer
import fr.lpiem.sweettodolist.app.domain.AppState
import fr.lpiem.sweettodolist.app.presentation.AppViewModel
import fr.lpiem.sweettodolist.main.domain.MainProcessor
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
            get<MainProcessor>(),
            get<AnalyticsProcessor>()
        )
    }

    // endregion Processors

    // region Reducers

    single {
        AppReducer(
            exampleReducer = get(),
            initialState = get()
        )
    }

    // endregion Reducers
}