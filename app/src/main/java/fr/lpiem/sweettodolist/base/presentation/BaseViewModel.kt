package fr.lpiem.sweettodolist.base.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import fr.lpiem.sweettodolist.app.domain.AppController
import fr.lpiem.sweettodolist.app.domain.AppState
import fr.lpiem.sweettodolist.base.domain.ActionType

abstract class BaseViewModel(private val appController: AppController) : ViewModel() {

    val state: LiveData<AppState> = appController.state

    fun dispatch(action: ActionType) {
        appController.dispatch(action)
    }
}