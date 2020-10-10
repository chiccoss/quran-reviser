package fr.sohayb.quranreviser.base.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import fr.sohayb.quranreviser.app.domain.AppController
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.domain.ActionType

abstract class BaseViewModel(private val appController: AppController) : ViewModel() {

    val state: LiveData<AppState> = appController.state

    fun dispatch(action: ActionType) {
        appController.dispatch(action)
    }
}